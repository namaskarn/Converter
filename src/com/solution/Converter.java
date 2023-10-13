package com.solution;

import java.util.Scanner;

//1. write a java program to convert temperature from Fahrenheit to Celsius degree.

public class Converter {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temp in Fahrenheit :");
	
		double fahrenheit = sc.nextDouble();
		
		double celsius = ((fahrenheit -32) *5) /9;
		
		System.out.println("Temp in celsius : "+ celsius);
		
		sc.close();
	}

}
