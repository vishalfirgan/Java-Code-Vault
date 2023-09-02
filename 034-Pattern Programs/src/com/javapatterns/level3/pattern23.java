package com.javapatterns.level3;

import java.util.Scanner;

public class pattern23 {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
		  System.out.print("Enter number of rows : ");
		  int n=scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(" ");
		}
		for(int j=n-i;j>=0;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=2;i<=n;i++)
	{
		int space=n;
		while(space!=0)
		{
			System.out.print(" ");
			space--;
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");	
		}
		System.out.println();

	}
}
}
