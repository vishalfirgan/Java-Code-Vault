package com.javapatterns.level3;

import java.util.Scanner;

public class pattern22 {
   public static void main(String[] args) {
	      Scanner scan=new Scanner(System.in);
		  System.out.print("Enter number of rows : ");
		  int n=scan.nextInt();
	   
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n-i+1;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=n-i+1;k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	 
   
      for(int i=1;i<n;i++)
      {
    	  for(int j=0;j<=i;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=0;k<=i;k++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
}
}
