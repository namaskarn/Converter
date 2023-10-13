package com.solution;

import java.time.LocalDateTime;
import java.util.Date;

//4. write a java program to convert minutes into a number of years and days.

public class Convert2number {
	
public static void main(String[] args) {
		
		Date now = new Date(); // this is a classic verson. java 8 have more
		
		

	System.out.println(now);
	
	LocalDateTime now8 = LocalDateTime.now();//here now is object and 8 means java 8.thisis   joda date api
	
	
	System.out.println(now8);

	}

}
