import java.util.Scanner;

public class main {
	public static void printFibonacciSeries(int n)
	{
	       int a=0,b=1,c=0;
	       
	       System.out.print(a+" ");
	       System.out.print(b+" ");
	       for(int i=2;i<n;i++)
	       {
	    	   c=a+b;
	    	   System.out.print(c+" ");
	    	   a=b;
	    	   b=c;
	       }
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	    printFibonacciSeries(n);
	}

}
