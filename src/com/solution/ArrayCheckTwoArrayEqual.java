package com.solution;

//how to check if two arrays are equal or not?

public class ArrayCheckTwoArrayEqual {
	
public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = { 5,3,7,1,2,4,89,45 };
		
	
	if(arr1.length !=arr2.length) {
	System.out.println("Arrays are not equal");
	return;
	
	}
	
	for(int i=0; i< arr1.length; i++) {
		if(arr1[i] !=arr2[i]) {
			
			System.out.println("Arrays are not equal");
			return;
			
		}
		
	}
	System.out.println("Arrays are equal"); // means need both arrays element in same place and length same
	}
	
	

}
