/* 
 * Exercise 2_10: Write a programt that calculates the energy needed to heat water from an initial
 * temperature to a final temperature. Your program should prompt the user to enter the amount of water
 * in kilograms and the initial and final temperatures of the water. The formula the energy is 
 * 		Q = M * (finalTemperature - initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius and energy Q is 
 * measured in joules.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_10;

import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double M = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		double Q = M * (finalTemperature - initialTemperature) * 4184;
		System.out.print("The energy needed is " + Q);
	}
}
