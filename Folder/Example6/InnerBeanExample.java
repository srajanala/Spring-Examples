package org.saisindhu.package6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanExample {
	
	private String name; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Main Class");
         ApplicationContext context= new ClassPathXmlApplicationContext("spring6.xml");
         Triangle6 triangle = (Triangle6) context.getBean("triangle6");
         
         InnerBeanExample in = (InnerBeanExample)context.getBean("mainClass");
         System.out.println(in.name);
         triangle.draw();      
	}

}
