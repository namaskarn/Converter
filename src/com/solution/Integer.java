package com.solution;

import java.util.Scanner;

//write a programe to take an integer value from user input

public class Integer {
	
public static char[] MIN_VALUE;
public static char[] MAX_VALUE;

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


	
	System.out.println("Enter an integer value: ");
	int x = sc.nextInt();
	
	for(int c = 1; c<11; c++) {
		
		System.out.println(x + " * " + c + " = "+ (x*c));
	}
	
	sc.close();
}

public static int valueOf(String s1) {
	// TODO Auto-generated method stub
	return 0;
}

public static int parseInt(String s1) {
	// TODO Auto-generated method stub
	return 0;
}
	

		//check these later

}
