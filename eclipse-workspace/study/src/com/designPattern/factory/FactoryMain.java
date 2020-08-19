package com.designPattern.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		RobotFactory rf = new SuperRobotFactory();
		Robot r = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");

		System.out.println(r.getName());
		System.out.println(r2.getName());
		
		RobotFactory mrf = new ModifiedSuperRobotFactory();
		Robot r3 = mrf.createRobot("com.designPattern.factory.SuperRobot");
		Robot r4 = mrf.createRobot("com.designPattern.factory.PowerRobot");
		
		System.out.println(r3.getName());
		System.out.println(r4.getName());
		

	}

}
