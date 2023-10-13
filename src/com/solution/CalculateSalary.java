package com.solution;

public class CalculateSalary {
	
	public static void main(String[] args) throws MyException {

		double totalSalary = calcSalary(100);
		System.out.println(totalSalary);

			}

			private static double calcSalary(int basic) throws MyException { // this throws says under those codes if you use will have to face the exception by main
				
				// forgiveness
				if(basic <=0) {
//					System.out.println("Bhai Shab, basic salary can not be zero or negative");
//				
//				
//				return 0;
//				}
				
					
					// punishment part means create exp and throw means show what was the problem
					if(basic <=0) {
						
					MyException exp = new MyException("Hey man, basic salary can not be zero or negative");
					
					throw exp;
					
					}
					
					// throw keyword can not handle exception but it transfer to main and only try catch handle the exception
					
					}
				
				double total = basic *2+50;
				return total;
				
			}
			
			
			
	
	

}
