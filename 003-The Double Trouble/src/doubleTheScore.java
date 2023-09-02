import java.util.Scanner;
public class doubleTheScore {
	public static double doubleTheNumber(int num) {
		return num*2;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the score : ");
        int score=scan.nextInt();
        System.out.println(doubleTheNumber(score));
        
           
	}

}
