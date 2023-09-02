import java.util.Scanner;
public class discount
{
public static void checkDiscount(double purchaseAmount)
{
	if(purchaseAmount>100)
	{
		System.out.println("Discount Applicable");
	}
  
}
public static void main(String[] args)
{
	 Scanner scan=new Scanner(System.in);
	 System.out.print("enter the price : ");
	 double purchaseAmount=scan.nextDouble();
	 checkDiscount( purchaseAmount);
	 
	   
}
}
