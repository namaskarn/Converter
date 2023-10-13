package com.solution;

import java.util.Scanner;

//write a program to take an integer value from user input

public class IntegerFact {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


	
	System.out.println("Enter an integer value: ");
	int num = sc.nextInt();
	
	int fact =1;
	
	for(int i = 1; i <=num; i++) {
		
		fact = fact *i;
	}
	System.out.println("Factorial of" + num + " is " + fact);
	
	sc.close();
}
	
	

}
