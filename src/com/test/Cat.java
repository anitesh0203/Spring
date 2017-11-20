package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;

@Component
public class Cat implements Animal{
	private String sound;
	private String walk;
	public Cat(){
		System.out.println(this.sound+"and"+this.walk);
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getWalk() {
		return walk;
	}
	public void setWalk(String walk) {
		this.walk = walk;
	}
	@Override
	public String typeOfAnimal() {
		// TODO Auto-generated method stub
		return "Iam a Cat Meow !!";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("iam being made");
	}
@PreDestroy
public void end(){
	System.out.println("iam ended");
}
}
