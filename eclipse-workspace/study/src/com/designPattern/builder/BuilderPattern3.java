package com.designPattern.builder;

public class BuilderPattern3 {

	public static void main(String[] args) {
		BuilderStudent studentInfo = new BuilderStudent.Builder("bja").build();
		System.out.println(studentInfo);
	}

}
//빌더패턴
class BuilderStudent{
	private final String name;	//필수
	private final String major;
	private final int age;		
	private final int grade;
	
	private BuilderStudent(Builder builder) {
		this.name = builder.name;
		this.major = builder.major;
		this.age = builder.age;
		this.grade = builder.grade;
	}
	
	//public class Builder{ -> 'static'안 붙이면 에러발생..
	public static class Builder{
		private final String name;//필수
		private String major;
		private int age;
		private int grade;
		
		public Builder(String name){
			this.name = name;
		}
		
		public Builder major(String major) {
			this.major = major;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public BuilderStudent build() {
			return new BuilderStudent(this);
		}
	}
	
	public String toString() {
		return "name : " + name +", major : " + major + ", age : "  + age + ", grade : " + grade; 
	}
}