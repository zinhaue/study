package com.designPattern.builder;


public class TelescopingConstructorPattern {

	public static void main(String[] args) {
		UserInfo1 userInfo = new UserInfo1("12345","bja");
	}
}

class UserInfo1{
	String deviceId;
	String name;
	String interests; //가변인자
	String skill;	  //가변인자
	
	//점층적생성자패턴
	public UserInfo1(String deviceId, String name) {
		this(deviceId, name, null);
	}
	public UserInfo1(String deviceId, String name, String interests) {
		this(deviceId, name, interests, null);
	}
	public UserInfo1(String deviceId, String name, String interests, String skill) {
		this.deviceId = deviceId;
		this.name = name;
		this.interests = interests;
		this.skill = skill;
	}
}