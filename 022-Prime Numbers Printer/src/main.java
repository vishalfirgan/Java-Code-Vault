import java.util.Scanner;

public class main {
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return true;
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
        
	public static void printPrimes(int n)
	{
	   int cnt=0;
	   for(int i=2;cnt<n;i++)
	   {
		   if(isPrime(i))
		   {
			   System.out.print(i+" ");
			   cnt++;
		   } 
	   }
	   
	}
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  printPrimes(n);
	  
	}
}
