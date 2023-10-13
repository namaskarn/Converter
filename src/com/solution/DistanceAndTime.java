package com.solution;

import java.util.Scanner;

//7. write a java programe to take the user for a distance (in meters) and the time was taken 

public class DistanceAndTime {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Distance in meters:");
	double distanceInMeter = sc.nextDouble();
	
	double distanceInKM = distanceInMeter /1000.0;
	double distanceInMiles = distanceInMeter /1609.0;
	
	
	System.out.println("Input hours:");
	int hours = sc.nextInt();
	
	System.out.println("Input minutes:");
	int minutes = sc.nextInt();
	
	System.out.println("Input seconds:");
	int seconds =sc.nextInt();
	
	int totalTimeInSeconds = (hours *60 *60)+(minutes *60) + seconds;
	
	double totalTimeInHours = totalTimeInSeconds /3600.0;
			
	
	
	double speedMeterPerSecond = distanceInMeter / totalTimeInSeconds;
	System.out.println("Speed MeterPerSecond : " +speedMeterPerSecond);
	
	double speedKmPerHour = distanceInKM / totalTimeInHours;
	System.out.println("Speed KM/Hour : " +speedKmPerHour);
	
	double speedMilesPerHour = distanceInMiles / totalTimeInHours;
	System.out.println("Speed Miles/Hour : " +speedMilesPerHour);
	
	sc.close();

	}
	

}
