package demo;

import org.shashank.library.config.impl.SpringConfigImpl;
import org.shashank.library.utility.CRUD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigImpl.class);
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");*/
		CRUD crud = context.getBean(CRUD.class);
		
		System.out.println(crud);
		
	}
}
