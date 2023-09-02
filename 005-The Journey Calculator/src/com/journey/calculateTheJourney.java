package com.journey;

import java.util.Scanner;

public class calculateTheJourney {

	public static void main(String[] args) {
				 Scanner scan=new Scanner(System.in);
				 System.out.print("Enter speed and time : ");
				 double speed=scan.nextDouble();
				 double time=scan.nextDouble();
				 
				 JourneyCalculator  J=new JourneyCalculator();
				 
				double distance=  J.calculateDistance(speed, time);
				System.out.println(distance);
			}
		
	}


