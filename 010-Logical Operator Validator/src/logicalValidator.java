import java.util.Scanner;
public class logicalValidator {
	public static boolean isValidInput(boolean first,boolean second)
	{
		if(first && second)
		{
			return true;
		}
		else
			return false;
	}
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Is input valid (true/false):");
	boolean first=scan.nextBoolean();
	System.out.print("Does input meet a certain condition (true/false):");
	boolean second=scan.nextBoolean();
	
	boolean result=isValidInput(first,second);
	if(result==true)
	{
		System.out.println("Input is valid.");
	}
	else
	{
		System.out.println("Input is invalid.");
		
	}
	
}
}
