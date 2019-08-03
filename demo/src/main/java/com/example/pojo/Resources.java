
package com.example.pojo;

import java.io.Serializable;

public class Resources  implements Serializable {
   private Integer resId;

   private String resName;

    private Integer pid;

    private String url;

   private String permission;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
       this.resId = resId;
    }

   public String getResName() {
       return resName;
   }

    public void setResName(String resName) {
       this.resName = resName == null ? null : resName.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

   public String getUrl() {
       return url;
    }

   public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPermission() {
        return permission;
    }

   public void setPermission(String permission) {
       this.permission = permission == null ? null : permission.trim();
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resId=" + resId +
                ", resName='" + resName + '\'' +
                ", pid=" + pid +
                ", url='" + url + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
