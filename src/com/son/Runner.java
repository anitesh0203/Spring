package com.son;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Man m1=context.getBean("man",Man.class);
		System.out.println("Name:"+m1.name()+"Age:"+m1.age());
		context.close();
		
	}

}
