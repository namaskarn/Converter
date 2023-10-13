package com.solution;

import java.util.Scanner;

//how to make short first name like N. K. Neupane

public class SplitName {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your full name");
		String str = sc.nextLine();

		sc.close();

		String[] words = str.split(" ");

		String initials = "";//this means blank by default now later my first letter N. will come here

		for (int i=0; i< words.length -1; i++) { // here -1 means i dont want last word
			
			char ch = words[i].charAt(0); //means namaskar is word which is in index i and 0 is character storing indicator ie N
			
			initials = initials + ch +". ";
			
		}
		initials = initials + words[words.length -1]; // means taking last elements from array

		System.out.println(initials);
			}


}
