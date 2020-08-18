package com.designPattern.builder;

import java.time.LocalDate;

public class BuilderPattern {

	public static void main(String[] args) {
		BuilderUser builderUser = new BuilderUser
				.Builder("1234", "bja", "test", "1111")
				.birthday(LocalDate.of(1999, 01, 01))
				.build();
	}
}
//빌더패턴
class BuilderUser{
	private final String deviceId;
	private final String name;
	private final String loginId;
	private final String password;
	private final LocalDate birthday;
	private final String hobby;
	private final String skill;
	
	private BuilderUser(Builder builder) {
		this.deviceId = builder.deviceId;
		this.name = builder.name;
		this.loginId = builder.loginId;
		this.password = builder.password;
		this.birthday = builder.birthday;
		this.hobby = builder.hobby;
		this.skill = builder.skill;
	}	
		public static class Builder{
			private final String deviceId;
			private final String name;
			private final String loginId;
			private final String password;
			private LocalDate birthday;
			private String hobby;
			private String skill;
			
			public Builder(String deviceId, String name, String loginId, String password) {
				this.deviceId = deviceId;
				this.name = name;
				this.loginId = loginId;
				this.password = password;
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
			
			public BuilderUser build() {
				return new BuilderUser(this);
			}
		
	}
}