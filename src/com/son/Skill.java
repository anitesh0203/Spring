package com.son;

import org.springframework.stereotype.Component;



public class Skill {
private int code;
private String desc;
public Skill()
{
	System.out.println("inside default construtir");
}

	public int getCode() {
	return code;
}


public void setCode(int code) {
	this.code = code;
}


public String getDesc() {
	return desc;
}


public void setDesc(String desc) {
	this.desc = desc;
}


	public String returnSkill(){
		return "He can Dance well !!";
	}
}
