package com.son;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Man implements Human {
	@Autowired
 private Skill thatSkill;
// @Autowired
//	public Man(Skill thatSkill){
//		System.out.println("hello skill dev has just been started!!");
//		this.thatSkill=thatSkill;
//		System.out.println("this is from the this variable"+this.thatSkill.returnSkill());
//		System.out.println("this is from the parameter passed to the constructor"+thatSkill.returnSkill());
		
	//}
// @Autowired
// public void setTheSkill(Skill thatGoodSkill){
//	 System.out.println("setting the skil");
//	 this.thatSkill=thatGoodSkill;
//	 
// }
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "anitesh";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 26;
	}

}
