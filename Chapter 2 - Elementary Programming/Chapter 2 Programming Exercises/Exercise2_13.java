/* 
 * Exercise 2_13: Suppose you save $100 each month into a savings account with the annual interest rate
 * 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 		100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * 		(100 + 100.417) + (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * 		(100 + 201.252) * (1 + 0.00417) = 302.507
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value
 * after the sixth month.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_13;

import java.util.Scanner;

public class Exercise2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthlySavingAmount = input.nextDouble();
		double accountValue = 0;
		for(int x = 0; x < 6; x++)
		{
			accountValue = (monthlySavingAmount + accountValue) * (1 + 0.00417);
		}
		System.out.print("After the sixth month, the account value is " + accountValue);
	}
}


