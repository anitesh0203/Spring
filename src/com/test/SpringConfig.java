package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class SpringConfig {
	@Bean
	public Cat cat(){
		return new Cat();
		
	}
	@Bean
	public  Dog dog(){
		return new Dog();
	}

}
