package com.solution;

import java.util.Scanner;

public class SumAndDifference {
	
	//9. write a java program that accepts two integers from the users and then prints the sum, the difference,	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first integer value:");
	int x = sc.nextInt();
	
	System.out.println("Enter second integer value:");
	int y = sc.nextInt();
	
	int sum = x+y;
	System.out.println("Sum= "+ sum);
	
	int diff = x-y;
	System.out.println("Diff= "+ diff);
	
	int prod = x*y;
	System.out.println("Prod= "+ prod);
	
	double ave = sum/2.0;
	
//	int min = Math.min(x, y);
//	int max = Math.max(x, y);
	
	int min, max;
	
	if(x>y) {
		max = x;
		min=y;
		
	}else {
		max = y;
		min = x;
	}
	System.out.println("Min = "+ min);
	System.out.println("Max = "+ max);
	
	sc.close();

	}


}
