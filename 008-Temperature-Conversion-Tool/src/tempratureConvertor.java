import java.util.Scanner;
public class tempratureConvertor {
	public static double celsiusToFahrenheit(double celsius) {
		return ((celsius * 9/5) + 32);
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) * 5/9);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:\n 1. Convert Celsius to Fahrenheit\n 2. Convert Fahrenheit to Celsius");
		System.out.print("Enter your choice:");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("Enter the temperature in Celsius:");
			double celsius=scan.nextDouble();
			double result1=celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to "+result1+"°F");
			break;
			
		case 2:
			System.out.print("Enter the temperature in n Fahrenheit:");
			double fahrenheit =scan.nextDouble();
			double result2=fahrenheitToCelsius( fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to "+result2+"°C");
			break;
			
	    default:
	    	System.out.println("Please enter choice eighter 1 or 2 ");
		
		}
		
		

	}

}
