package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
Zoo zoo=context.getBean("zoo",Zoo.class);
System.out.println("Iam in main and just built a zoo phew !!");
System.out.println(zoo.hehe());
context.destroy();

	}
}
