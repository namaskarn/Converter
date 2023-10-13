package com.solution;

import java.util.Arrays;

//WAP to reverse an array

public class ArrayReverseCase {
	
public static void main(String[] args) {
		
		String[] names = {"JavaSE", "JavaEE", "JavaME", "Angular", "React" };
		
		int size = names.length;
		
		String[] reversed = new String[size]; // here i create new array but we can do without create new array how lets see next sample
		
		for(int i = 0; i<names.length; i++) {
			
			reversed [size - i - 1] = names[i]; // here size is 5 -i means 0 so 5-0=0 and 0-1= 4 so what string in 4th position comes and store in names [i]
		}
		
		System.out.println("Original : " + Arrays.toString(names));
		System.out.println("Reversed : " + Arrays.toString(reversed));
}
	
	

}
