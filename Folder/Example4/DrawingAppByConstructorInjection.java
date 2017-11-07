package org.saisindhu.pacakage4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppByConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
         Triangle4 t=(Triangle4) context.getBean("triangle");
         t.draw();
	}

}
