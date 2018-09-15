/* 
 * Exercise 2_14:Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking
 * your weight in kilograms and dividing by the square of your height in  meters. Write a program that 
 * prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note that one
 * pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_14;

import java.util.Scanner;

public class Exercise2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightKilograms = (input.nextDouble()) * 0.45359237;
		System.out.print("Enter height in inches: ");
		double heightMeters = (input.nextDouble()) * 0.0254;
		double bmi = weightKilograms / (Math.pow(heightMeters, 2));
		System.out.println("BMI is " + bmi);
	}

}
