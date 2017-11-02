package org.saisindhu.package3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppByMemberVariablePreSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Triangle3 triangle=(Triangle3) context.getBean("triangle");
        triangle.draw();
	}

}
