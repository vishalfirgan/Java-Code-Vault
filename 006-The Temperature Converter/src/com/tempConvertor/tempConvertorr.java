package com.tempConvertor;
import java.util.Scanner;
public class tempConvertorr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter temprature in fahrenheit :");
		
		double f=scan.nextDouble();
		
		TemperatureConverter temp=new TemperatureConverter();
		double res=temp.convertFahrenheitToCelsius(f);
		System.out.println(res);
		
	}

}
