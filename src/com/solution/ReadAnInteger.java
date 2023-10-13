package com.solution;

import java.util.Scanner;

//3. write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

public class ReadAnInteger {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 1000 :");
	
		int number = sc.nextInt();
		
		if(number <=0 || number >=1000) {
		
		System.out.println("Invalid input, please try again..");
		
		sc.close();
		return;
		}
		
		// i want to see individual disit means 567 ma last value7 middle value6 and first value5
		// int q= 567/10; means answer value is 56 
		// int lastDigit =567 %10; means remaining value 7
		
		int sum =0; // here 0+7 = 7 later 7+6=13 again 56/10 and left 5 so 13+5=18 is sum value. so after this 5/5=0 and it will out from loop and print like below
		int num = number;
		
		//here 56>0 right and list digit is 6 now
		while (num>0) {
			
			int lastDigit = num %10;
			sum = sum + lastDigit;
			
			num = num /10; //here num is 56 now
		}
		
		System.out.println("Sum of digits for " + number + " is " + sum);// expected sum of digits for 567 is 18
		
		sc.close();
		
	}

}
