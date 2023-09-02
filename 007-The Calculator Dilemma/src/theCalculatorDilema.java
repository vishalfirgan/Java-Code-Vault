
import java.util.Scanner;
public class theCalculatorDilema {
	public static void calculate(int a,int b,char operator)
	{
		switch(operator) {
		case '+' :
			System.out.println(" a+b = "+(a+b));
			break;
		case '-' :
			System.out.println(" a-b = "+(a-b));
			break;	
		case '*' :
			System.out.println(" a*b = "+(a*b));
			break;
		case '/' :
			System.out.println("a/b = "+(a/b));
			break;
			
	    default:
	    	System.out.println("Please enter a valid operator.");
		}
		
		
	}

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.print("Enter any two numbers : ");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    System.out.print("Enter  operator to perform operation : ");
	    char operator=scan.next().charAt(0);
	    
	    calculate(a,b,operator);
	}

}
