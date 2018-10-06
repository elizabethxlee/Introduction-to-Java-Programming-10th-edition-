package exercise2_5;
/* 
 * Exercise 2_5: Write a program that reads the subtotal and the gratuity rate, then computes the gratuity
 * and total. For example, the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
import java.util.Scanner;
public class Exercise2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = (input.nextDouble())/100;
		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
