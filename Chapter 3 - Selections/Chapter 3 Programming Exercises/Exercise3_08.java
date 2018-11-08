/*
 * Exercise 3_8: Write a program that prompts the user to enter three integers and display the integers in
 * non-decreasing order
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise3_08;
import java.util.Scanner;

public class Exercise3_08 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int placeholder;
		
		if (num1 > num2)
		{
			placeholder = num1;
			num1 = num2;
			num2 = placeholder;
		}
		if (num2 > num3)
		{
			placeholder = num2;
			num2 = num3;
			num3 = placeholder;
		}
		if (num1 > num2)
		{
			placeholder = num1;
			num1 = num2;
			num2 = placeholder;
		}
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);

	}

}
