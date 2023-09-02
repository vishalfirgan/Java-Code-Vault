import java.util.*;
public class stringJoiner {

	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}
	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter two strings :");
	  String s1=scan.nextLine();
	  String s2=scan.nextLine();
	  System.out.println(joinStrings(s1,s2));
	  
		
	}

}
