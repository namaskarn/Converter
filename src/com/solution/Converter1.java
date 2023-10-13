package com.solution;

import java.util.Scanner;


//2. write a java program that reads a number in inches, converts it to meters.

public class Converter1 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length in inches :");
	
		double inches = sc.nextDouble();
		
		// note one inch is 0.0254 meter.
		
		double meters = inches *0.0254;
		
		System.out.println("Length in meters : "+ meters);
		
		sc.close();
	}	
	

}
