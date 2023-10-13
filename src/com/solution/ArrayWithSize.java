package com.solution;

import java.util.Arrays;
import java.util.Scanner;

//WAP to take size of an array. fill elements in the array by user input

public class ArrayWithSize {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


	
	System.out.println("Enter an integer value: ");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	
	int sum =0;
	
	for(int i = 0; i <size; i++) {
		
		System.out.println("Enter an element for array :");
		int element = sc.nextInt();
		arr[i] = element;
		sum=sum + element;
	}
	System.out.println("Sum = " +sum);
	
	System.out.println("Array = " + Arrays.toString(arr));//this will dispalay value nicely
	
	sc.close();
}
		

}
