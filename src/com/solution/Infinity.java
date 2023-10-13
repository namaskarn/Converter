package com.solution;

//10. write a java program to test whether a given double/float value is a finite floating-point value or not,

public class Infinity {

	public static void main(String[] args) {
		
//		int x =10;
//		double a =10/0;
//		System.out.println(a);//ArithmaeticException
	//	
		double b =10/0.0;
		System.out.println(b);//infinity
		
		double c = -10/1.1;
		System.out.println(c);//-infinity
		
		double d = 0.0/0.0;
		System.out.println(d);//NaN means not a number 
		
		if (b==Double.POSITIVE_INFINITY) {
			
			System.out.println("yes it is infinity");
		}
		


		}
	
	
}
