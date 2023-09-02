package com.javapatterns.level2;

public class pattern13 {
   public static void main(String[] args) {
//	   
	   int cnt=5;
	   int temp=cnt;
	   for(int i=1;i<=5;i++)
	   {  
		   cnt=temp;
		   for(int j=1;j<=5-i+1;j++)
		   {
			   System.out.print(cnt);
			   cnt--;
		   }
		   System.out.println();
	   }
	   
	   System.out.println();
}
}
