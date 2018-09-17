package Exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		String name;
		double gpa;
		
		System.out.println("What is your name? ");
		name = input.next();
		
		System.out.println("What is your GPA? ");
		gpa = input.nextDouble();
		
		computeCredit(gpa, name);
	}
public static void computeCredit(double gpa, String name) {
	
	double money = 10.00;
	double totalMoneyGiven;
	
	totalMoneyGiven = money * gpa;
	
	System.out.println("Congratulations " + name + " you get " + totalMoneyGiven + "$ of bookstore credit!");
}
}
