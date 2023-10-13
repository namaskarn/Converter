package com.solution;

import java.util.Scanner;


//6.Write a java program to compute body mass index (BMI) look at google saying BMI formula

public class BodyMassIndex {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		

	System.out.println("Input weight in pounds");
	double weight = sc.nextDouble();
	
	System.out.println("Input height in incheses:");
	double height = sc.nextDouble();
	
	
	
	double bmi =(weight / (height * height))*703;
	
	System.out.println("BMI is : " +bmi);
	
	sc.close();

	}	
	

}
