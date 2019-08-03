//package com.example.service.impl;
//
//import com.alibaba.fastjson.JSONObject;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Date;
//
//@Aspect
//// 申明是个spring管理的bean
//@Component
//public class LogAspectServiceApi {
//	private static final Logger log = LoggerFactory.getLogger(LogAspectServiceApi.class);
//	private JSONObject jsonObject = new JSONObject();
//
//	// 申明一个切点 里面是 execution表达式
//	@Pointcut("execution(public * com.example.service.*.*(..))")
//	private void controllerAspect() {
//	}
//
//	// 请求method前打印内容
//	@Before(value = "controllerAspect()")
//	public void methodBefore(JoinPoint joinPoint) {
//		log.info("===============请求内容===============");
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
//		String msg=sdf.format(date);
//		log.info("==============请求时间========>  "+msg);
//		log.info("--------------返回内容----------------");
//
//		try {
//			log.info("请求类方法:" + joinPoint.getSignature());
//			log.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
//		} catch (Exception e) {
//			log.error("###LogAspectServiceApi.class methodBefore() ### ERROR:", e);
//		}
//		log.info("===============请求内容===============");
//	}
//
//	// 在方法执行完结后打印返回内容
//	@AfterReturning(returning = "o", pointcut = "controllerAspect()")
//	public void methodAfterReturing(Object o) {
//		log.info("--------------返回内容----------------");
//		try {
//			log.info("Response内容:" + jsonObject.toJSONString(o));
//		} catch (Exception e) {
//			log.error("###LogAspectServiceApi.class methodAfterReturing() ### ERROR:", e);
//		}
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
//		String msg=sdf.format(date);
//		log.info("==============返回时间========>  "+msg);
//		log.info("--------------返回内容----------------");
//
//	}
//}
