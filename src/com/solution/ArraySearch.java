package com.solution;

//WAP how to search an elements inside the array

import java.util.Scanner;

public class ArraySearch {
	
public static void main(String[] args) {
		
		int[] arr = {85, 3, 4, 21, 98, 3, 6, 2, 9, 46};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you key :");
		
		int x = sc.nextInt();
		int index = -1; // means value not gonna found in any index its a trick
		
		for(int i=0; i<arr.length; i++) {
			
			if(x==arr[i]) { //this means x value in any arry of i found gonna store in index = i
				index =i;
				break; // means once it found desire value it will out from the loop
			}
		}
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			
			System.out.println("Found at index "+ index);
		}
}

}
