package com.config.review;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationJava.class);
		FootballCoach ronaldo=context.getBean("footballCoach",FootballCoach.class);
		//System.out.println(ronaldo.returnFortune());

	}

}
