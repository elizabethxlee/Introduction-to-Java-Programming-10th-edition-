/*
 * Exercise 4_09: Write a program that receives a character and displays its Unicode.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise4_09;
import java.util.Scanner;

public class Exercise4_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String characterInput = input.next();

		char character = characterInput.charAt(0);
		System.out.println("The Unicode for the character " + character + " is " + ((int)character));
	}

}
