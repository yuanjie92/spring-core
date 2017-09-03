package org.jie.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理对象
 * @author yuanjie
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method["+method.getName()+"]start...");
		Object obj = method.invoke(target, args);
		System.out.println("method["+method.getName()+"]end...");
		return obj;
	}
	
	public void setTarget(Object target) {
		this.target = target;
	}

}
