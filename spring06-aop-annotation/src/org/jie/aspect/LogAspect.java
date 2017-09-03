package org.jie.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(* org.jie.dao.*.*.add(..))")
	public void pointCut(){
		
	}
	
	@Before("pointCut()")
	public void log(){
		System.out.println("spring aop log...");
	}
	
	@After("pointCut()")
	public void logAfter(){
		System.out.println("spring aop logAfter...");
	}
	
}
