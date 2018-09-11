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
		
		displayTemp(tempMorning);
		displayTemp(tempNoon);
		displayTemp(tempAfternoon);
	}
	public static void displayTemp(int tempMorning)
	{
		int tempC;
		tempC = (tempMorning - 32) * 5 / 9;
		System.out.println("The morning temp is " + tempC + " degrees celcius");
	}

}









