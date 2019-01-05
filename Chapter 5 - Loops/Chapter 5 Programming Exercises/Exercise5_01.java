/*
 * Exercise 5_01: Write a program that reads an unspecified number of integers, determines how many positive
 * and negative values have been read, and computes the total and average of the input values(not counting zeros).
 * Your program ends with the input 0. Display the average as a flaoting-point number. Here is a sample run:
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */


package exercise5_01;
import java.util.Scanner;
public class Exercise5_01 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		double sum = 0;
		int positive = 0;
		int negative = 0;
		int counter = 0;
		double number = input.nextDouble();
	
		
		while(number != 0) // checks the condition to make sure that the input is not 0.
		{
			if(number==0)
			{
				break;
			}
			if(number>0)
			{
				positive++;
				sum += number;
				counter++;
			}
			else if(number<0)
			{
				negative++;
				sum += number;
				counter++;
			}
			number = input.nextDouble();
		}
		
		if(counter==0)
		{
			System.out.print("No numbers are entered except 0");
		}
		else if(counter > 0)
		{
			System.out.println("the number of positives is " + positive);
			System.out.println("the number of negatives is " + negative);
			System.out.println("the total is " + sum);
			System.out.println("The average is " + sum / counter);
		}
		
	}

}
