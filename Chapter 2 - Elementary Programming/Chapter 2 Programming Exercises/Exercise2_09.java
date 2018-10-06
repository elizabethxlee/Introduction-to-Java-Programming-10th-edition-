/* 
 * Exercise 2_9: Average acceleration is defined as the change of velocity divided by the time taken to 
 * make the change, as shown in the following formula:
 * 		 a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending
 * velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_9;

import java.util.Scanner;

public class Exercise2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double averageAcceleration = (v1 - v0) / t;
		System.out.print("The average acceleration is " + averageAcceleration);
	}

}
