import java.util.*;
public class billing {
	public static double calculateTotalWithTax(double price,double rate)
	{
		double taxes=price*rate;
		return taxes+price;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		double purchaseAmount=scan.nextDouble();
		
		System.out.print("Enter the tax rate (in decimal form): ");
		double taxRate=scan.nextDouble();
		
		double result=calculateTotalWithTax(purchaseAmount,taxRate);
		System.out.println("Total cost including tax: "+result);

	}

}
