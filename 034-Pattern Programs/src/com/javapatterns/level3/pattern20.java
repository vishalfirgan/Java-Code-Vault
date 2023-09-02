package com.javapatterns.level3;

public class pattern20 {
   public static void main(String[] args) {
	   for(int i=1;i<=5;i++)
	   {
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=5;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
	   for(int i=5;i>0;i--)
	   {
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=5;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
}
}
