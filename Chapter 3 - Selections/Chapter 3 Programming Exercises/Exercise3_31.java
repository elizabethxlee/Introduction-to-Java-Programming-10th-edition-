/*
 * Exercise 3_31: Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars
 * Korean won. Prompt the user to enter 0 to convert from U.S. dollars to S.Korean won and 1 to convert from S.Korean
 * won and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Korean won to convert it to Korean won
 * or U.S. dollars, respectively.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise3_31;	
import java.util.Scanner;

public class Exercise3_31 {
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to won: ");
		double exchangeRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to won 1 vice versa: ");
		int convert = input.nextInt();
		double amount = 0;
		switch (convert)
		{
			case 0: 
			{
				System.out.print("Enter the dollar amount: ");
				amount = input.nextDouble();
				System.out.print("$" + amount + " is " + (amount*exchangeRate) + " Korean won.");
				break;
			}
			case 1: 
			{					
				System.out.print("Enter the won amount: ");
				amount = input.nextDouble();
				System.out.print(amount + " won is " + (amount/exchangeRate) + " U.S dollars");
				break;
			}
		}
	}
}
