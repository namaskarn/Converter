package com.solution;

public class StringIMutable {
	
	public static void main(String[] args) {

		String str = "Java";

		str = str.replace("J", "L");//Lava comes but string are immutable means can not change but we see Lava means JVM creates new string as lava 

		//so we will have 2 string Java and Lava

		System.out.println(str);

		String s1 = "I love";
		s1 = s1+"Java";

		//here three string 1 i love 2java 3i love java

		System.out.println(s1 );
			}
	

}
