package com.solution;

import java.util.Arrays;

//WAP how to merge elements from two arrays

public class ArrayMeargeFromTwoElement {
	
public static void main(String[] args) {
		
		int[] arr1 = {90, 80, 70, 60};
		int[] arr2 = {15,25,35};
		
		int[] arr3 = new int[arr1.length + arr2.length];
		
		//filling merged array with first arr
		for(int i=0; i<arr1.length; i++) {
			
			arr3[i] = arr1[i]; // means in arr3 all the elements will be coming from arr1 means here [90,80,70,60,0,0,0]
			
			
		}
		System.out.println(Arrays.toString(arr3));
		
		for(int i=0; i<arr2.length; i++) {
			
			arr3[i+arr1.length]=arr2[i];
		}
// it means now in arr3 value from arr2 will be coming and storing at the end like [90,80,70,60,15,25,35]
	System.out.println(Arrays.toString(arr3));
	
// we can use other steps too like
	
	for(int x: arr3) {
		
		System.out.println(x);
	}
	
	Arrays.stream(arr3).forEach(System.out::println);
	} 
	
	

}
