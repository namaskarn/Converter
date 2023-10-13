package com.solution;

import java.util.Scanner;

//write a programe to take 5 subjects marks from user input

public class MarksInPercentage {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//this is one way lets see other way too
		//System.out.println("Enter marks of first Subject");
		//int a = sc.nextInt();	
		//
		//System.out.println("Enter marks of second Subject");
		//int b = sc.nextInt();
		//
		//System.out.println("Enter marks of third Subject");
		//int c = sc.nextInt();
		//
		//System.out.println("Enter marks of forth Subject");
		//int d = sc.nextInt();
		//
		//System.out.println("Enter marks of fifth Subject");
		//int e = sc.nextInt();
		//
		//int sum = a+b+c+d+e;
		//
		//double percentage = (sum/500.0)*100;
		//
		//System.out.println("the sum is sum and percentage is " + percentage);


		int sum =0;

		for(int x=1; x<=5; x++) {
			
			System.out.println("Enter the marks of subject" + x);
			int a=sc.nextInt();
			
			sum = sum+a;
		}
		double percentage = (sum/500.0)*100;
			
			System.out.println("the sum is " + sum + "and percentage is " + percentage);
			
			sc.close();
		}
			

			

}
