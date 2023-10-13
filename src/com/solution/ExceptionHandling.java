package com.solution;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		//
		//try {
//			//Uses the connection for DB operations
		//}catch (Exception e) {
//			//Do this, when exception occurs
		//}finally {
		//	
//			//close the connection
		//}
		//
		//but this is the wrong way to handle arithmatic error handling means jokes of nimuniya.. try to solve first using if(!b=0)

//			Scanner scanner = new Scanner(System.in);
		//	
//			System.out.println("Enter first number");
//			int a = scanner.nextInt();
		//	
//			System.out.println("Enter second number");
//			int b = scanner.nextInt();
		//	
//			try {
//			int result = a/b;
		//	
//			System.out.println(result);
//			}catch (Exception e) { // this means i found exception in catch block
//				System.out.println(e.getMessage());
//				
//			}
//			System.out.println("done");
//			scanner.close();
			// unchecked exception we can not handle using try catch but we can stop to occur it but if my file was missing due to enveronment error it will handle.
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter first number");
				int a = scanner.nextInt();
				
				System.out.println("Enter second number");
				int b = scanner.nextInt();
				
				if(b !=0) {
				int result = a/b; // means we are doing division and if b is 0 will be problomatic. so it shouldnot be 0
				
				System.out.println(result);
				
					
				}else {
					System.out.println("We can not allow 0 as divisor");
				}
				System.out.println("done");
				scanner.close();
			}

		}// class is  a user define data type and interface is also user define data type. in class we can crate method with body but in interface we can not create body with method.
		// in interface all method by default public abstract whether you declared or not.
		// interface came in to the picture just for multiple inheritance. 
		// inside the interface body we cant have variable but have constant like int j = 10; means public static final int k =10;  
		// class crow extends Animal if animal class is abstract class Animal bu implement is use form interface Animal. so extend like a papa and implement like a uncle.
		// public class crow extends Animal implements Flyable and we use @Override method in the class to specific method ie. s.o.p("crow is flying or eating")
		// means we can implement more interface in one class like implements flyable, serializable, Cloneable, runnable...




