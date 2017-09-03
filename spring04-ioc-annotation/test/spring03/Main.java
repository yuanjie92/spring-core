package spring03;

import org.jie.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.jie.service","org.jie.dao"})
public class Main {
	
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		UserService service = context.getBean(UserService.class);
		service.add();
	}
}
