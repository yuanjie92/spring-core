package spring03;

import org.jie.dao.UserDao;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"org.jie.dao","org.jie.aspect"})
@EnableAspectJAutoProxy
public class AnnotationTest {

	ApplicationContext context = null;
	
	@Before
	public void before(){
		context = new AnnotationConfigApplicationContext(AnnotationTest.class);
	}
	
	@org.junit.Test
	public void test() {
		UserDao userDao = context.getBean(UserDao.class);
		userDao.add();
	}

}
