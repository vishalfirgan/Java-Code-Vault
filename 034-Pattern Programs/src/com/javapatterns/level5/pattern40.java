package com.javapatterns.level5;

import java.util.Scanner;

public class pattern40 {

	public static void main(String[] args) {

   Scanner scan=new Scanner(System.in);
   System.out.print("enter odd number of rows plz.. : ");
   int n=scan.nextInt();
    for(int i=1;i<=n;i++)
    {
    	 
    	int space=n-i;
    		while(space!=0) {
    			System.out.print(" ");
    			space--;
    		}
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("*");
    		}
    	   int k=i-1;
    	   while(k!=0)
    	   {
    		   System.out.print("*");
    		   k--;
    	   }
    		    		
    	System.out.println();
    }
   
     for(int i=2;i<=n;i++)
     {
    	 int space=i-1;
    	 while(space!=0)
    	 {
    		 System.out.print(" ");
    		 space--;
    	 }
    	 for(int j=1;j<=n-i+1;j++)
    	 {
    		 System.out.print("*");
    	 }
    	 int k=n-i;
    	 while(k!=0)
    	 {
    		 System.out.print("*");
    		 k--;
    	 }
    	 
    	 System.out.println();
     }
   

	}

}
