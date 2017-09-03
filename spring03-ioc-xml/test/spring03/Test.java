package spring03;

import org.jie.service.UserService;
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
		UserService service = context.getBean(UserService.class);
		service.add();
	}

}
