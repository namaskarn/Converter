package com.solution;

public class Boolean {
	
	
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		boolean b3 = s1==s2;
		System.out.println(b3);// true beacause s1 and s2 are string and 1 will be replaced with 2 when object creating time because there is no new keyword
		
		boolean b4 = s1.equals(s2);
		System.out.println(b4);//true because equals method checks contain so both have same contain JAVA-  
		
		
		
		String s3 = new String("PYTHON");
		String s4 = new String("PYTHON");
		
		boolean b5 = s3 == s4;
		
		System.out.println(b5);// here false because use of new keyword it will create new object and there address will be different
		
		
		boolean b6 = s3.equals(s4);
		
		System.out.println(b6);//true because equals method checks contain so both have same contain PYTHON
		

	}

	public static char[] parseBoolean(String s4) {
		// TODO Auto-generated method stub
		return null;
	}

}
