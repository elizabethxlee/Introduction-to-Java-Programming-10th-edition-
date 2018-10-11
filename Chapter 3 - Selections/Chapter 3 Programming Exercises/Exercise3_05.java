/*
 * Exercise 3_5: Write a program that prompts the user to enter an integer for today's day of the week
 * (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of days
 * after today for a future day and display the future day of the week.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise03_05;

import java.util.Scanner;

public class Exercise3_05 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int num_date = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int num_days = input.nextInt();
		int num_next_date;
		String str_today_date = "";
		String str_next_date = "";
		switch(num_date)
		{
			case 0: str_today_date = "Sunday"; break;
			case 1: str_today_date = "Monday"; break;
			case 2: str_today_date = "Tuesday"; break;
			case 3: str_today_date = "Wednesday"; break;
			case 4: str_today_date = "Thursday"; break;
			case 5: str_today_date = "Friday"; break;
			case 6: str_today_date = "Saturday"; break;
		}
		num_next_date = (num_date + num_days) % 7;
		switch(num_next_date)
		{
			case 0: str_next_date = "Sunday"; break;
			case 1: str_next_date = "Monday"; break;
			case 2: str_next_date = "Tuesday"; break;
			case 3: str_next_date = "Wednesday"; break;
			case 4: str_next_date = "Thursday"; break;
			case 5: str_next_date = "Friday"; break;
			case 6: str_next_date = "Saturday"; break;
		}
		System.out.println("Today is " + str_today_date + " and the future day is " + str_next_date);
	}

}
