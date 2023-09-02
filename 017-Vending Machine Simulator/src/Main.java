import java.util.Scanner;
public class Main {
//	 Cocacola, Pepsi ,Fanta,JalJeera,MountainDew,and BoatGuava in the list
//	By Default Let the Drink be Panaka  wrapper classses in java
	public static void getProduct(String productCode)
	{
	    switch(productCode) {
	    case "P01":
	    	System.out.println("Cocacola");
	    	break;
	    case "P02":
	    	System.out.println("Pepsi");
	    	break;
	    case "P03":
	    	System.out.println("fanta");
	    	break;
	    case "P04":
	    	System.out.println("Jaljeera");
	    	break;
	    case "P05":
	    	System.out.println("MountianDew");
	    	break;
	    case "P06":
	    	System.out.println("BoatGuava");
	    	break;
	    default:
	    	System.out.println("panaka");
	    	
	    
	    }
	}
	public static void main(String[] args)
	{
		 Scanner scan=new Scanner(System.in);
		 String code=scan.nextLine();
		 getProduct(code);
	}
}
