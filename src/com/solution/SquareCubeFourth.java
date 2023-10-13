package com.solution;

import java.util.Scanner;


//7. write a java program that reads a number and display the square, cube, and fourth powerkilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

public class SquareCubeFourth {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a integer value:");
	int x = sc.nextInt();
	
	
	double sq = Math.pow(x, 2);
	System.out.println("Square of "+ x +" is " + sq);
	
	double cube =Math.pow(x, 3);
	System.out.println("cube of "+ x + " is " + cube);
	
	double fourth = Math.pow(x, 4);
	System.out.println("fourth of " + x + " is " + fourth);
	
	
	
	sc.close();

	}
	

}
