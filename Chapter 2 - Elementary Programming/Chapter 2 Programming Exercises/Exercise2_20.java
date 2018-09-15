/* 
 * Exercise 2_20: If you know the balance and the annual percentage interest rate, you can compute the 
 * interest on the next monthly payment using the following formula:
 * 		interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and displays the 
 * interest for the next month.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_20;

import java.util.Scanner;

public class Exercise2_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		double interest = balance * (interestRate / 1200);
		System.out.print("The interest is " + interest);
	}

}
