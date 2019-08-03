package com.example.shiro;

import com.example.dao.RoleMapper;
import com.example.dao.UserMapper;
import com.example.pojo.Role;
import com.example.pojo.User;
import com.example.pojo.Resources;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author kdm
 * @date 2019/8/3 8:21
 */
public class ShiroRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Resource
    private RoleMapper roleMapper;
   @Resource
    UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.getPrimaryPrincipal();
        if(user!=null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            Role role = userMapper.queryRoleByUserId(user.getUserId());

            List<Resources> permissions = roleMapper.queryResourceByRoleId(role.getRoleId());
            for (Resources p : permissions){
                info.addStringPermission(p.getPermission());
            }
            info.addRole(role.getRoleName());
            return info;
        }


        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userMapper.queryByAccount(token.getUsername());
        if(user==null){
            logger.error("用户 { "+token.getUsername()+" } 不存在 ");
            throw new AccountException("账户不存在");
        }
        if(user.getStatus()==false){
            logger.error("用户 { "+token.getUsername()+" } 被禁止登录 ");
            throw new DisabledAccountException("账号已经禁止登录");
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());

    }
}
