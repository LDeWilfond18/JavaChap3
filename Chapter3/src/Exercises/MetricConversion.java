package Exercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		double value;
		
		System.out.println("What is your value? ");
		value = input.nextDouble();
		
		inchToCentimeters(value);
		litersToGallons(value);
	}
public static void inchToCentimeters(double value) {
	
	double centimetersInInch = 2.54;
	double totalConversion;
	
	totalConversion = centimetersInInch * value;
	System.out.println("There are " + totalConversion + " centimeters in " + value + "inches");
	
}
public static void litersToGallons(double value) {
	
	double litersInGallon = 3.7854;
	double totalGallons;
	
	totalGallons = litersInGallon * value;
	System.out.println("There are " + totalGallons + " Gallons in " + value + " liters");
}
}


















