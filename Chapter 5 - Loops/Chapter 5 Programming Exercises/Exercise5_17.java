/*
 * Exercise 5_17: Write a program that prompts the user to enter an integer from 1 to 15 and
 * displays a pyramid, as shown in the following sample run:
 * Enter the number of lines: 7
 *        1
 *       212
 *      32123
 *     4321234
 *    543212345
 *   65432123456
 *  7654321234567
 * 
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise5_17;
import java.util.Scanner;
public class Exercise5_17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int numLines = input.nextInt();
		
		//print spaces
		for (int x = 1; x < numLines + 1; x++)
		{
			for(int i = x; i < numLines; i++)
			{
			System.out.print("  ");
			}
			
			for(int j = x; j > 0; j-- )
			{
				System.out.print(j + " ");
			}
			for(int k = 2; k < x +1; k++)
			{
				System.out.print(k + " ");

			}
			System.out.println("");//newline
		}
	}

}
