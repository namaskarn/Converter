package com.solution;

public class Vowel {
	
	public static void main(String[] args) {

		String str = "I Love Java"; // capital I treated as consonant so what you do convert string as lower case
		String strLowerCase = str.toLowerCase();
		
		int vowels =0;
		int consonants =0;
		
		for(int i=0; i<str.length(); i++) { // in array we have .length field only bu in string we have length method.to find out length of character
			
			char ch = str.charAt(i); //  here i am finding character from index i using charAt()
			
			if(ch == ' ') { // here if it is space i am not going to add any vowel or consonant so continue to next step
				
				continue;
				
			}
				
			 else if(ch == 'a'|| ch =='e' || ch =='i' || ch =='o' ||ch =='u') {
				
				vowels++; // means no space it will give vowel as above and didnot match those gives consonant
			}else {
				consonants++;
				
			}
		}
		
		System.out.println("vowels = " + vowels + " AND consonants = " + consonants);

	}

}
