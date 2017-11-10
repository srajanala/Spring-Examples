package org.saisindhu.package5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppByInjectionObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
         Triangle5 triangle=(Triangle5) context.getBean("triangle5");
         triangle.draw();
	}

}
