import java.util.Scanner;

public class mainn {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		get g=new get();
		System.out.println(g.power(n));

	}

}
