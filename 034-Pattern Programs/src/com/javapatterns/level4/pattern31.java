package com.javapatterns.level4;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		    System.out.print("Enter number of rows : ");
			  int n=scan.nextInt();
			  
			  for(int i=1;i<=n;i++)
			  {
				  for(int j=1;j<=n;j++)
				  {
					  if(i==1 || j==1 || i==n/2+1 || j==n|| i==n)
					  {
						  System.out.print("*");
					  }
					  else
					  {
						  
						  System.out.print(" ");
					  }
					 
				  }
				  System.out.println();
			  }

	}

}
