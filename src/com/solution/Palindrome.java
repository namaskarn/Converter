package com.solution;

//13.Palindrome means sulto bata ulto jastai 12345 bata 54321  in java

public class Palindrome {
	
	
	public static void main(String[] args) {
		int num = 12321;
		
		int x = num;
		int revNum =0;
		
		while (x>0) {
			
			int lastDigit = x%10; //it will give reminder means last digit
			revNum = revNum*10 +lastDigit;
			
			x = x/10; // it will work after that last disit out from number
		}
		
		
			System.out.println(num);
			System.out.println(revNum);
			
			if(num==revNum) {
				System.out.println("Yes Palindrome");
				
			}else {
				System.out.println("No, not a Palindrome");
			}
				
		
	}

}
