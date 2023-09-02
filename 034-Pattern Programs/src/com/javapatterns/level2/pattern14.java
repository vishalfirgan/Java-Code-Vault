package com.javapatterns.level2;

public class pattern14 {
  public static void main(String[] args) {
//	 for(int i=1;i<=5;i++)
//	 {
//		 for(int j=1;j<=i;j++)
//		 {
//			 System.out.print("*");
//		 }System.out.println();
//	 }
//	 
//	 for(int i=5;i>0;i--)
//	 {
//		 for(int j=1;j<=i;j++)
//		 {
//			 System.out.print("*");
//		 }System.out.println();
//	 }
	  
	  int n=20;
	         for(int i=1;i<=n;i++)
			 {
				 for(int j=1;j<=i;j++)
				 {
					 System.out.print("*");
				 }System.out.println();
			 }
			 
			 for(int i=n;i>0;i--)
			 {
				 for(int j=1;j<=i;j++)
				 {
					 System.out.print("*");
				 }System.out.println();
			 }
	  
	  
}
}
