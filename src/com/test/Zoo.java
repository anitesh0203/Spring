package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
	@Qualifier("cat")
	private Animal animal;
//	@Autowired
	public Zoo(Animal animal)
	{
		System.out.println("Iam inside the zoo!!");
		System.out.println(animal.typeOfAnimal());
		
	}
    public String hehe()
    {
    	return animal.typeOfAnimal();
    }
}
