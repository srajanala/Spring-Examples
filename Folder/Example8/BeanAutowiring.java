package org.saisindhu.package8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
        Triangle8 triangle=(Triangle8) context.getBean("triangle");
        triangle.draw();
	}

}
