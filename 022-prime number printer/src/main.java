import java.util.Scanner;
import java.util.*;
public class main {
	public static boolean isPrime(int n)
	{
//		System.out.println("hhe");
		if(n<=1)
		{
			return false;
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
//		System.out.println(isPrime(5));
	   int cnt=0;
		
		for(int i=2;i<=n*n;i++)
		{
			if( isPrime(i) && cnt<n)
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
