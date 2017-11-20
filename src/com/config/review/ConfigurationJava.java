package com.config.review;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.config.review")
public class ConfigurationJava{
	@Bean
	public Fortune goodFortune()
	{
		return new GoodFortune();
	}
	@Bean
	public Coach footballCoach()
	{
		return new FootballCoach(goodFortune());
	}
	
}