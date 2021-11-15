package springcore9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			AbstractApplicationContext context =new ClassPathXmlApplicationContext("LifeCycle.xml");
			context.registerShutdownHook();
			BeanLifeCycle obj =(BeanLifeCycle) context.getBean("BeanLifeCycle");
			obj.show();
		}

	}
