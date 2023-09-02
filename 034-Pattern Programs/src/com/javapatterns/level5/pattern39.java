package com.javapatterns.level5;

import java.util.Scanner;

public class pattern39 {
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
//	  System.out.print("Enter number of rows : ");
//	  int n=scan.nextInt();
	  int n=10;
	  int cnt=65;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((i==1 && j<=n/2) || (j==1 && i<=n/2) || (j==n/2 && i<=n/2) ||(i==n/2 && j<=n/2))
			{
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
			if((i==n/2+1 && j>n/2) || (i>n/2 && j==n/2+1)|| (i==n && j>n/2) || (j==n && i>n/2))
			{
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
			
		}
		System.out.println();
	}
}
	
}
