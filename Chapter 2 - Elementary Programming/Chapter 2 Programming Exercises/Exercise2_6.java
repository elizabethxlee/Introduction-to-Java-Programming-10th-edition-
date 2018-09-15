/* 
 * Exercise 2_6: Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the & operator to extract digits, and use the / operator to remove the extracted digit.
 * i.e. 932 % 10 = 2 and 932 / 10 = 93
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_6;

import java.util.Scanner;

public class Exercise2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int ones = number % 10;
		number = number / 10;
		
		int tens = number % 10;
		number = number / 10;
		
		int hundreds = number;
		
		int sum = ones + tens + hundreds;
		System.out.println("The sum of the digits is " + sum);
	}

}
