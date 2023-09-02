import java.util.Scanner;

public class main {
	public static void printTable(int n)
	{
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(n+"*"+i+"="+(n*i));
	     }
	}
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  printTable(n);
			  
	}
}
