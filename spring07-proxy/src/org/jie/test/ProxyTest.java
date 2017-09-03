package org.jie.test;

import java.lang.reflect.Proxy;

import org.jie.dao.UserDao;
import org.jie.dao.impl.UserDaoImpl;
import org.junit.Test;

public class ProxyTest {
	
	@Test
	public void test(){
		UserDao userDao = new UserDaoImpl();
		MyInvocationHandler h = new MyInvocationHandler();
		//把被代理对象设置到代理对象中
		h.setTarget(userDao);
		Object obj = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), h);
		userDao = (UserDao) obj;
		//获取到代理对象的接口
		Class[] c = userDao.getClass().getInterfaces();
		for(Class clazz : c){
			System.out.println("c:"+clazz.getName());
		}
		userDao.add();
	}
}
