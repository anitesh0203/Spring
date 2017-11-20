package com.config.review;

import org.springframework.stereotype.Component;
@Component
public class GoodFortune implements Fortune {

	@Override
	public String returnFortune() {
		// TODO Auto-generated method stub
		return "Its a bad fortune";
	}

}
