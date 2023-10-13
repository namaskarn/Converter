package com.solution;

//static variable and static member are associated with class. so we can access it with the help of class name ie Car.wc=50; 
//here Car is class name and wc is static object where we are adding value 50
//using object reference c1 variable we can add value in heap memory w ie. c1.w=15;   


public class Student {
	
	int rollNum;
	String name;
	static String college; //if you make it static this can be use other class
	
	void study() {
		
		System.out.println("Abi Mood nahi hai...");
	}

}
