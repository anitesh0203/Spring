package com.config.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
 public FootballCoach() {
	// TODO Auto-generated constructor stub

}
	@Override
	public String getExercise() {
		// TODO Auto-generated method stub
		return "Iam a football coach";
	}
	
	public FootballCoach(GoodFortune goodFortune){
		
		System.out.println(goodFortune.returnFortune());
	}
	public FootballCoach(Fortune goodFortune) {
		// TODO Auto-generated constructor stub
		System.out.println("reached");
		System.out.println(goodFortune.returnFortune());
	}
	

}
