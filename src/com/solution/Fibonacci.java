package com.solution;

//12. Fibonacci in java

public class Fibonacci {
	
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34 ..
		//in for loop i is used as variable and start from 1 but in array i is index and starts from index 0
		
		int x =0;
		int y =1;
		
		System.out.println(x + " ");
		System.out.println(y + " ");
		
		//here i need 10 number but 0 and 1 is already here so i will start loop from 3
		
		for(int i =3; i<=10; i++) {
			
			int next = x+y;
			System.out.println(next + " ");//here next means after 0 1 next value will find
			
			//now value will be change x value will be y value in every next step
			x=y;
			y=next;
			
			
		}
	}

}
