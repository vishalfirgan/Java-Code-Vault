import java.util.Scanner;
public class main
{
public static void categorizeAge(int age) {
// Child (0-12), Teen (13-19),Adult (20-59), Senior (60+).
	if(age>=0 && age<=12)
	{
		System.out.println("Child");
	}
	else if(age>12 && age<=19)
	{System.out.println("Teen");
	}
	else if(age>19 && age<=59)
	{
		System.out.println("Adult");
	}
	else if(age >=60)
	{
		System.out.println("Senior");
	}

}
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	categorizeAge(age);
}
}