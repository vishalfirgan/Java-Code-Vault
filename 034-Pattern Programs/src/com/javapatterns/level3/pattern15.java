package com.javapatterns.level3;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.print("Enter number of rows : ");
		  int n=scan.nextInt();
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				if( j<=5)
//					System.out.print("$");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//		}
		
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2;j++)
			{
				if( j<=n)
					System.out.print("$");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
