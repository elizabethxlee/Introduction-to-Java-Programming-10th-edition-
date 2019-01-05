/*
 * Exercise 5_09: Write a program that prompts the user to enter the number of students
 * and each student's name and score, and finally displays the student with the
 * highest score and the student with the second-highest score.
 * 
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise5_09;
import java.util.Scanner;
public class Exercise5_09 
{
	public static void main(String[] args) 
	{
		String currentName = "";
		String firstName = "";
		String secondName = "";
		int currentScore = 0;
		int firstScore = 0;
		int secondScore = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		
		for(int x = 0; x < numStudents; x++)
		{
			System.out.print("Enter student " + (x+1) + "'s name: ");
			currentName = input.next();
			System.out.print("Enter student " + (x+1) + "'s score: ");
			currentScore = input.nextInt();
			
			if(currentScore > firstScore)
			{
				secondScore = firstScore;
				secondName = firstName;
				
				firstScore = currentScore;
				firstName = currentName;
				continue;
			}
			else if(currentScore < firstScore && currentScore > secondScore)
			{
				secondScore = currentScore;
				secondName = currentName;
				continue;
			}
			else
			{
				continue;
			}
		}
		System.out.println("The student with the highest score is " + firstName + " with a score of " + firstScore + ".");
		System.out.println("The student with the second-highest score is " + secondName + " with a score of " + secondScore + ".");
		
	}

}
