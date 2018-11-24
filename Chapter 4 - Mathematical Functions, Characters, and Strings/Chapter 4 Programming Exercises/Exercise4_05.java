/*
 * Exercise 4_05: A regular polygon is an n-side polygon in which all sides are of the same length and
 * all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
 * computing the area of a regular polygon is
 * 			Area = (n*s^2)/(4*tan(pi/n))
 * Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their
 * length of a regular polygon and displays its area.
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */

package exercise4_05;
import java.util.Scanner;

public class Exercise4_05 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides in the polygon: ");
		int sides = input.nextInt();
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		double area = (sides * Math.pow(length, 2)/
		(4*Math.tan(Math.PI/sides)));
		System.out.println("The area of the polygon is " + area);
	}
}
