package com.org.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
		public static void main(String[] args) {
			ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			HelloWorld helloWorldBean = context.getBean("myBean", HelloWorld.class);
			helloWorldBean.setMessage("Hello All");
			System.out.println(helloWorldBean.getMessage());
	}

}
