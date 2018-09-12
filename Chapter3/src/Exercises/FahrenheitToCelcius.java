package Exercises;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int tempMorning;
		int tempNoon;
		int tempAfternoon;
		
		System.out.println("What is the temperature in the morning? ");
		tempMorning = input.nextInt();
		System.out.println("What is the temperature in at noon? ");
		tempNoon = input.nextInt();
		System.out.println("What is the temperature in the afternoon? ");
		tempAfternoon = input.nextInt();
		
		displayTemp(tempMorning, 8);
		displayTemp(tempNoon, 12);
		displayTemp(tempAfternoon, 5);
	}
	public static void displayTemp(int tempMorning, int time)
	{
		double tempC;
		tempC = (tempMorning - 32) / 1.8;
		System.out.println("The temp at "+ time + " is " + tempC + " degrees celcius");
	}

}









