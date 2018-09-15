/* 
 * Exercise 2_7: Write a program that prompts the user to enter the minutes (e.g. 1 billion), and displays
 * the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_7;

import java.util.Scanner;

public class Exercise2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int years = minutes / 525600;
		System.out.println(years);
		
		
	}
}
