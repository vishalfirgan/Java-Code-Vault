import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
        DigitSum p=new DigitSum();
       System.out.println(p.getNoDigits(n)) ;
	}

}
