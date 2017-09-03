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
		//�ѱ�����������õ����������
		h.setTarget(userDao);
		Object obj = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), h);
		userDao = (UserDao) obj;
		//��ȡ���������Ľӿ�
		Class[] c = userDao.getClass().getInterfaces();
		for(Class clazz : c){
			System.out.println("c:"+clazz.getName());
		}
		userDao.add();
	}
}
