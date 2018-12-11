/*
 * Exercise 4_24: Write a program that prompts the user to enter three cities and displays them
 * in ascending order.
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise4_24;
import java.util.Scanner;
public class Exercise4_24 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String firstCity = input.next();
		
		System.out.print("Enter the second city: ");
		String secondCity = input.next();
		
		System.out.print("Enter the third city: ");
		String thirdCity = input.next();
		
		System.out.print("The three cities in alphabetical order are ");
		
		if (firstCity.compareToIgnoreCase(secondCity)<0)
		{
			if (firstCity.compareToIgnoreCase(thirdCity)<0)
			{
				if (secondCity.compareToIgnoreCase(thirdCity)<0)
				{
					System.out.println(firstCity + " " + secondCity + " "+ thirdCity);
				}
				else
				{
					System.out.println(firstCity + " " + thirdCity + " " + secondCity);
				}
			}
		}
		if (secondCity.compareToIgnoreCase(firstCity)<0)
		{
			if (secondCity.compareToIgnoreCase(thirdCity)<0)
			{
				if (firstCity.compareToIgnoreCase(thirdCity)<0)
				{
					System.out.println(secondCity+" "+firstCity+" "+ thirdCity);
				}
				else
				{
					System.out.println(secondCity+" "+ thirdCity +" "+ firstCity);
				}
			}
		}
		if (thirdCity.compareToIgnoreCase(firstCity)<0)
		{
			if (thirdCity.compareToIgnoreCase(secondCity)<0)
			{
				if (firstCity.compareToIgnoreCase(secondCity)<0)
				{
					System.out.println(thirdCity +" " + firstCity +" "+ secondCity);
				}
				else
				{
					System.out.println(thirdCity + " " + secondCity + " " + firstCity);
				}
			}
		}
			
	}
}
