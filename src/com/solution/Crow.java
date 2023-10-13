package com.solution;

//class is  a user define data type and interface is also user define data type. in class we can crate method with body but in interface we can not create body with method.
//in interface all method by default public abstract whether you declared or not.
//interface came in to the picture just for multiple inheritance. 
//inside the interface body we cant have variable but have constant like int j = 10; means public static final int k =10;  
//class crow extends Animal if animal class is abstract class Animal bu implement is use form interface Animal. so extend like a papa and implement like a uncle.
//public class crow extends Animal implements Flyable and we use @Override method in the class to specific method ie. s.o.p("crow is flying or eating")
//means we can implement more interface in one class like implements flyable, serializable, Cloneable, runnable...


public class Crow extends Animal implements Flyable {
	
	@Override
	void eat() {
		
		System.out.println("Crow is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		System.out.println("Crow is flying  ");
		
	}

}

//1. class extends class
//2. class implements interface
//3. interface ? class C.E.
//4. Interface extends Interface



