package org.saisindhu.package9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
        Shape shape=(Shape) context.getBean("triangle");
        shape.draw();
        Shape shape1=(Shape) context.getBean("circle");
        shape1.draw();
	}

}