package com.solution;

import java.util.Arrays;

//WAP to reverse an array with out creating new array but using swapping from half wayss

public class ArraySwappingHalfway {
	
	
public static void main(String[] args) {
		
		String[] names = {"JavaSE", "JavaEE", "JavaME", "Angular", "React" };
		
		System.out.println("Original : " + Arrays.toString(names));
		
		int size = names.length;
		
		
		for(int i = 0; i<size /2; i++) {
			
			
	// here we are swapping two numbers
			  
			String first = names[i];
			String last = names[size -i -1];
			
			names[size -i -1] = first;
			names[i] = last;
		}
		
		
		System.out.println("Reversed : " + Arrays.toString(names));
}
	
	

}
