package spring03;

import org.jie.dao.UserDao;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	ApplicationContext context = null;
	
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@org.junit.Test
	public void test() {
		UserDao userDao = context.getBean(UserDao.class);
		userDao.add();
	}

}
