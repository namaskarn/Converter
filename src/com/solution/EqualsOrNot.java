package com.solution;

//take 2 string check whether they are equals or not without using equals method

public class EqualsOrNot {
	
	public static void main(String[] args) {

		String str1 ="Java";
		String str2 = "JAVA";
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Equals");
			return;
			
			
		}

		boolean isEquals = true;
		
		for (int i=0; i< str1.length(); i++) {
			
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			if(ch1 != ch2) {
				isEquals = false;
				break;
				
				
			}
		}
		if(isEquals) {
			
			System.out.println("Equals");
		}else {
			
			System.out.println("Not Equals");
		}
		
//		String str1 ="Java";
//		String str2 = "JAVA";
//		
//		boolean isEquals = str1.equals(str2);
//if(isEquals) {
//			
//			System.out.println("Equals");
//		}else {
//			
//			System.out.println("Not Equals");
//		}
	}

	

}
