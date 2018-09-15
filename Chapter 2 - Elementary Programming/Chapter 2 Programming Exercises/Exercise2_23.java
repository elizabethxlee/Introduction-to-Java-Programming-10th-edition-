/* 
 * Exercise 2_23: Write a program that prompts the user to enter the distance to drive, the fuel efficiency
 * of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_23;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		
		System.out.print("Enter the price per gallon: ");
		double ppg = input.nextDouble();
		
		double cost = (distance / mpg) * ppg;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("The cost of driving is " + formatter.format(cost));
		}

}
