package org.saisindhu.package7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingCollectionSpringExample {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			 ApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
	         Triangle7 triangle=(Triangle7) context.getBean("triangle7");
	         triangle.draw();
		

	}


}
