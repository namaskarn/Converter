package com.solution;

//where we need wrapper classes? first i want to know the limit, max limit min limit | second i have string which contains digit which i want to convert numeric

public class ConvertString {
	
	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		int x = 101; //this is numeric value

		// String s = x +"";// means convert into Textual value;

		String s = String.valueOf(x);// convert into textual value;
		System.out.println(s);

		System.out.println("*****************************");

		String s1 = "205";//this is textual value

		int y = Integer.parseInt(s1);// it convert string/textual value into Numeric value;
		int z = Integer.valueOf(s1);// convert string/textual value into Numeric value;

		System.out.println("----we can not use primitive in collections and Generics---as thsose works on only objects not primitive vales---");
			}
	

}
