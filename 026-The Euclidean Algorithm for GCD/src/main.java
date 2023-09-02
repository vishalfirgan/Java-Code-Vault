import java.util.Scanner;

public class main {
	public static void printGcd(int m,int n)
	{
		
		while(n!=0)
		{
			int rem=m%n;
		    m=n;
		    n=rem;
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		printGcd(a,b);
         
	}

}
