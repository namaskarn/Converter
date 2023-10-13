package com.solution;

public class StaticCollegeName {
	
public static void main(String[] args) {

		
		Student.college = "Papa University"; // this means all student below can use this university directly. no need to make instance variable
		
		Student s1 = new Student();
		s1.rollNum = 101;
		s1.name = "Narayan";

		
		Student s2 = new Student();
		s2.rollNum = 101;
		s2.name = "Bishnu";
		
		Student s3 = new Student();
		s3.rollNum = 101;
		s3.name = "Jasmin";
	}

}
