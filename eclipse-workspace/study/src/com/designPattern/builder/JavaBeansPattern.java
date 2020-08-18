package com.designPattern.builder;


public class JavaBeansPattern {

	public static void main(String[] args) {
		BeansUser beansUser = new BeansUser();
	}

}
//자바빈즈패턴
class BeansUser{
	private String deviceId;
	private String name;
	private String interests; //가변인자
	private String skill;	  //가변인자
	
	public BeansUser() {
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		System.out.println("setDeviceId");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setName");
	}
	
	public void setInterests(String interests) {
		this.interests = interests;
		System.out.println("setInterests");
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
		System.out.println("setSkill");
	}
}