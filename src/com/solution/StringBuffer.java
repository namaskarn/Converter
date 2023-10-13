package com.solution;

public class StringBuffer {
	
	public static void main(String[] args) {

		//String str = "Namaskar Neupane";
		//
		//StringBuffer sb = new StringBuffer(str);
		//
		//StringBuffer sbRev = sb.reverse();
		//
		//String strRev = sbRev.toString(); // string from stringbuffer
		//System.out.println(strRev);

				
				
		// without using string buffer
				
//				String str = "pallav neupane";
//				
//				char[] arr = str.toCharArray();
//				
//				int size = arr.length;
//				
//				for(int i=0; i< size /2; i++) {
//				
//				char first = arr[i];
//				char last = arr[size-i -1];
//				
//				arr[i] =last;
//				arr[size-i-1] = first;
//				
//				
//			}
		//	
//			String strReversed = new String(arr);
//			System.out.println(strReversed);
				
				
				// one more way
				
				String str = "Namaskar Neupane";
				
				String strReverse = "";  //here we are creating another string and getting character from the last of the name and adding to starting point ""
				
				for(int i= str.length()-1; i>=0; i--) {
					
					strReverse = strReverse + str.charAt(i);
				}
				
				System.out.println(strReverse);
			}

}
