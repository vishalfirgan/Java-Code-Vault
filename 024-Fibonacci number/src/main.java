import java.util.Scanner;

public class main {
	public static void printIt(int n)
	{
		if(n==1)
		{
			System.out.println("0");
		}
		else if(n==2) 
			System.out.println("1");
		
		int cnt=3;
		int a=0,b=1,c=0;
	 for(int i=2;i<cnt;i++)
	 {
		 c=a+b;
		 a=b;
  	     b=c;
		 if(cnt==n)
		 {
			 System.out.println(c);
		 }
		 cnt++;
	 }
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printIt(n);

	}

}
