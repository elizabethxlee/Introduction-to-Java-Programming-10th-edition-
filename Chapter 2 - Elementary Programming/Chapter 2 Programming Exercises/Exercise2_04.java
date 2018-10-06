package exercise2_4;
/* 
 * Exercise 2_4: Write a program that converts pounds into kilograms. The program prompts the user to 
 * enter a number in pounds, converts it to kilograms, and displays the result. One pount is 0.454 kilograms.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
import java.util.Scanner;
public class Exercise2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
