package com.designPattern.builder;


public class JavaBeansPattern2 {

	public static void main(String[] args) {
		BeansUser2 beansUser = new BeansUser2();
		beansUser.setDeviceId("1234");
		beansUser.setName("bja");
		beansUser.setInterests("");
		beansUser.setSkill("");
	
	}

}
//자바빈즈패턴
class BeansUser2{
	private String deviceId;
	private String name;
	private String interests; //가변인자
	private String skill;	  //가변인자
	
	BeansUser2(){}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
}