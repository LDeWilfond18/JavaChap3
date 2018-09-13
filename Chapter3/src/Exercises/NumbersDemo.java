package Exercises;

import java.util.Scanner;


public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		System.out.println("Enter your x value >> ");
		x = input.nextInt();
		System.out.println("Enter your y value >> ");
		y = input.nextInt()
		displayNumberPlusFive(x, y);
		displayTwiceTheNumber(x, y);
		displayNumberSquared(x, y);
	}
	public static void displayTwiceTheNumber(int x, int y) {
		
		int x2;
		int y2;
		
		x2 = x * 2;
		y2 = y * 2;
		System.out.println("x = " + x2 + " y = " + y2);
	}
	public static void displayNumberPlusFive(int x, int y) {
		
		int xSum;
		int ySum;
		
		xSum = x + 5;
		ySum = y + 5;
		System.out.println("x = " + xSum + " y = " + ySum);
	}
	public static void displayNumberSquared(int x, int y) {
		int xSquared;
		int ySquared;
		
		xSquared = x * x;
		ySquared = y * y;
		System.out.println("x squared = " + xSquared + " y squared = " + ySquared);
	}
	
}














