package com.firstPkg.springDemo;

public class myApp {

	public static void main(String[] args) {

		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}
