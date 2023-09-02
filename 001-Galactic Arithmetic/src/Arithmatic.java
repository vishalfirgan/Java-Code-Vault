import java.util.Scanner;
public class Arithmatic {
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		
		System.out.println(galacticAddition (num1,num2));
	}

}
