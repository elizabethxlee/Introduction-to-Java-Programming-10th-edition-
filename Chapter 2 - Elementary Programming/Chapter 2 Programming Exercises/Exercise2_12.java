/* 
 * Exercise 2_12:Given an airplane's acceleration (a) and take-off speed (v), you can compute the minimum
 * runway length needed for an airplane to take off using the following formula:
 * 			length = (v^2) / (2a)
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
 * meters/second squared (m/s^2), and displays the minimum runway length.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise2_12;

import java.util.Scanner;

public class Exercise2_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		double length = (Math.pow(v, 2)) / (2 * a);
		System.out.print("The minimum runway length for this airplane is " + length);
	}
}
