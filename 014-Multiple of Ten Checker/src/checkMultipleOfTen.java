import java.util.Scanner;
public class checkMultipleOfTen {
	public static void checkNumMultipleOfTen(int n)
	{
	   if(n%10==0)
	   {
		   System.out.println("Your entered number "+n+" is multiple of 10.");
	   }
	   else {
		   System.out.println("Your entered number "+n+" is not multiple of 10.");
	   }
	}
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  checkNumMultipleOfTen( n); 
      
	}

}
