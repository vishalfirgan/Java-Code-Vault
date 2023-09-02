import java.util.Scanner;
public class PalindromeChecke {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
        checkPalindrome c=new checkPalindrome();
       
       System.out.println(c.isPalindrome(n));
	}

}
