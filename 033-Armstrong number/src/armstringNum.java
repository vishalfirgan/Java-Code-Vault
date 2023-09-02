import java.util.Scanner;

public class armstringNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 isArmstrong a=new isArmstrong();
		 if(a.checkArmstrong(n))
		 {
			 System.out.println("number is armstrong");
		 }
		 else
		 {
			 System.out.println("not armstrong number.");
		 }
		

	}

}
