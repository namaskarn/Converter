package com.solution;

public class ParseBoolean {
	
	public static void main(String[] args) {

		String s1 = "101";
		String s2 = "101.5";
		String s3 = "Shadab";
		String s4 = "TrUe";
		
		// can we convert s1 into boolean using Boolean.parseBoolean ? no because boolean is not a Number and it gives reasult as false 
		// can we convert s2 into boolean using Boolean.parseBoolean ? no
		// can we convert s3 into boolean using Boolean.parseBoolean ? no 
		// can we convert s4 into boolean using Boolean.parseBoolean ? yes 
		System.out.println(Boolean.parseBoolean(s4));
		
		
	}
	

}
