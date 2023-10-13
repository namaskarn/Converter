package com.solution;

import java.util.Scanner;

//4. write a java program to convert minutes into a number of years and days.

public class Convert2minutes {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter minutes ");

		long minutes = sc.nextLong();
		
		//here think if you put only 200days it will not come years so do like this
		
		long hours = minutes /60;
		long days = hours/24;
		long remainingDays = days % 365;
		long years = days / 365;

		System.out.println(minutes + " in " + years + " years and " + remainingDays + " days ");
		
		sc.close();

	}
	

}
