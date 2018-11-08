/*
 * Exercise 3_9: An ISBN-10 consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * 		(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) %11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10convention. Write a program
 * that prompts the user to enter the first 9 digits and displays the 10 digit ISBN (including leading zeros).
 * Your program should read the input as an integer.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise3_09;
import java.util.Scanner;

public class Exercise3_09 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		int d9 = userInput % 10;
		userInput /= 10;
		int d8 = userInput % 10;
		userInput /= 10;
		int d7 = userInput % 10;
		userInput /= 10;
		int d6 = userInput % 10;
		userInput /= 10;
		int d5 = userInput % 10;
		userInput /= 10;
		int d4 = userInput % 10;
		userInput /= 10;
		int d3 = userInput % 10;
		userInput /= 10;
		int d2 = userInput % 10;
		userInput /= 10;
		int d1 = userInput % 10;
		userInput /= 10;
		
		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) %11;
		
		switch (checksum) {
		case 10: System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X"); break;
		default: System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum); break;
		}

		
	}

}
