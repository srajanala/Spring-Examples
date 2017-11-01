package org.saisindhu.package2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppByApplicationContext {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle2 triangle = (Triangle2) context.getBean("triangle");
		triangle.draw();

	}

}
