/*
 * Exercise 3_1: The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the 
 * following formula:
 * r1 = (-b+sart(b^2-4ac))/2a and r2 = (-b-sqrt(b^2-4ac))/2a
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. 
 * If it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a program that prompts 
 * the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. 
 * If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some sample runs.
 * Note: You can use Math.pow(x , 0.5) to compute sqrt(x)
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise3_01;

public class Exercise3_01 {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double roots = Math.pow(b, 2) - (4*a*c);
		if (roots > 0)
		{
			System.out.print("The equation has two roots " + (-b + Math.pow(roots, 0.5))/2*a + " and " + (-b - Math.pow(roots, 0.5))/2*a);
		}
		else if (roots < 0)
		{
			System.out.print("The equation has no real roots");
		}
		else
		{
			System.out.print("The equation has one real root " + (-b + Math.pow(roots, 0.5))/2*a);
		}
	}
}
