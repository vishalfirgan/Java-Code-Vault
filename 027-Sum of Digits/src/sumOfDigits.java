import java.util.Scanner;

public class sumOfDigits {
	public static void findSum(int n)
	{
          int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println(sum);
	}
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	findSum(n);
}
} 
