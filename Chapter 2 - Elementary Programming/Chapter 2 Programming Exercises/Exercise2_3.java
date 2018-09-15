package Exercise2_3;
/* 
 * Exercise 2_3: Write a program that reads a number in feet, converts it to meters, and displays the result.
 * One foot is .305 meter.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
import java.util.Scanner;
public class Exercise2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}

}
