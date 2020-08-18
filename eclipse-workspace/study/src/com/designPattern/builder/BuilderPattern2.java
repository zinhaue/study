package com.designPattern.builder;

import java.time.LocalDate;

public class BuilderPattern2 {

	public static void main(String[] args) {
		BuilderUser2 builderUser = new BuilderUser2.Builder("1234", "bja").birthday(LocalDate.of(1999,01,01)).build();
		System.out.println(builderUser);
	}

}
//빌더패턴
class BuilderUser2{
	private final String deviceId;	//필수
	private final String name;		//필수
	private final String loginId;
	private final String password;
	private final LocalDate birthday;
	private final String hobby;
	private final String skill;
	
	private BuilderUser2(Builder builder) {
		this.deviceId = builder.deviceId;
		this.name = builder.name;
		this.loginId = builder.loginId;
		this.password = builder.password;
		this.birthday = builder.birthday;
		this.hobby = builder.hobby;
		this.skill = builder.skill;
	}
	
	//static class Builder {
	public static class Builder {
		private final String deviceId;
		private final String name;
		private String loginId;
		private String password;
		private LocalDate birthday;
		private String hobby;
		private String skill;
		
		Builder(String deviceId, String name){
			this.deviceId = deviceId;
			this.name = name;
		}
		
		public Builder loginId(String loginId) {
			this.loginId = loginId;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder birthday(LocalDate birthday) {
			this.birthday = birthday;
			return this;
		}
		
		public Builder hobby(String hobby) {
			this.hobby = hobby;
			return this;
		}
		
		public Builder skill(String skill) {
			this.skill = skill;
			return this;
		}
		
		public BuilderUser2 build() {
			return new BuilderUser2(this);
		}
	}
	
	public String toString() {
		return "deviceId : " + deviceId + ", name : " + name + ", loginId : " +loginId +", password : " + password + ", birthday : " + birthday + ", skill : "+ skill;
	}
}