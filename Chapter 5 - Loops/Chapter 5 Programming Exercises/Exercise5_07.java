/*
 * Exercise 5_07: Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
 * In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years
 * and the total cost of four years' worth of tuition after the tenth year.
 * 
 * Assumption: The tuition amount being used to calculate the 4 years' worth of tuition does not increase after the tenth year.
 * 
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */


package exercise5_07;
import java.util.Scanner;
public class Exercise5_07 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What is the initial tuition amount in US dollars? ");
		double tuition = input.nextDouble();
		
		for(int x = 1; x < 10; x++)
		{
			tuition *= 1.05;
		}
		
		System.out.printf("The tuition will be $%1.2f in 10 years", tuition);
		System.out.printf("\nFour years' worth of tuition would be $%1.2f", tuition*4);
	}

}
