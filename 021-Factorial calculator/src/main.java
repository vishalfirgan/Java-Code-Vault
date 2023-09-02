import java.util.Scanner;

public class main {
   public static void fact(int n)
   {
	   int mul=1;
	   for(int i=1;i<=n;i++)
	   {
		   mul*=i;
	   }
	   System.out.println(mul);
   }
   public static void main(String []args) {
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   fact(n);
   }
	
}
