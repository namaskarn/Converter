package com.solution;

//we have to method compare method and equals method(it has two flavour 1 case sensetive and 2 ignore the case and only match the character

public class CompareAndIgnore {
	
	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "java";

		//boolean isEquals = str1.equals(srt2);

		boolean isEquals = str1.equalsIgnoreCase(str2); // here we are using ignore case means it will try to check both java java are same or not by ignoring unitl equal

		if(isEquals) {
			System.out.println("Equals");
			
		}else {
			
			System.out.println("Not Equals");
		}

		System.out.println("*************************");

		//int result = str1.compareTo(str2);

			int result = str1.compareToIgnoreCase(str2);// means string have same character but in different case
			
			if(result ==0) {
				
				System.out.println("Equals");//here result = 0 means equals otherwise not equals
			}else {
				
				System.out.println("Not Equals");
			}
					
			}
	

}
