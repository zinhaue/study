package com.designPattern.builder;


public class TelescopingConstructorPattern2 {

	public static void main(String[] args) {
		TeleUser2 teleUser = new TeleUser2("12345","bja");
	}
}

//점층적생성자패턴
class TeleUser2{
	String deviceId;
	String name;
	String interests; //가변인자
	String skill;	  //가변인자
	
	TeleUser2(String deviceId, String name){
		this(deviceId, name, null);
	}
	
	TeleUser2(String deviceId, String name, String interests){
		this(deviceId, name, interests, null);
	}
	
	TeleUser2(String deviceId, String name, String interests, String skill){
		this.deviceId = deviceId;
		this.name = name;
		this.interests = interests;
		this.skill = skill;
	}
}