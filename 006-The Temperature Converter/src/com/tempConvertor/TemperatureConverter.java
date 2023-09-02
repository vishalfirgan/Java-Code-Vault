package com.tempConvertor;

public class TemperatureConverter {
	public double convertFahrenheitToCelsius(double f){
		double c=(f-32)*5/9;
		return c;
	}
}
