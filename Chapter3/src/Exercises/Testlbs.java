package Exercises;

import java.util.Scanner;

public class Testlbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		double pounds;
		
		System.out.println("How many pounds? ");
		pounds = input.nextDouble();
		
		displayConversionKilo(pounds);
		displayConversionOunces(pounds);
		displayConversionMilligrams(pounds);
		
	}
public static void displayConversionKilo(double pounds) {
	
	double kilograms;
	
	kilograms = pounds * .4535;
	
	displayAnswers(kilograms);
}
public static void displayConversionOunces(double pounds) {
	
	double ounces;
	
	ounces = pounds * 16;
	
	displayAnswers(ounces);
}
public static void displayConversionMilligrams(double pounds) {
	
	double milligrams;
	
	milligrams = pounds * 453592;
	
	displayAnswers(milligrams);
}
public static void displayAnswers(double answers) {
	
	System.out.println("Your answer is >> " + answers);
	
	
}
}



























