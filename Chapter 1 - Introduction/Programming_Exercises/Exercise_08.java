/*
* Exercise 1_8: Write a program that displays the area 
* and perimeter of a circle that has a radius of 5.5 
* using the following formula
*	perimeter = 2 * radius * pi
*	area = radius * radius * pi
*
* Programmer: Elizabeth Lee
* Book: Introduction to Java Programming - Y. Daniel Liang
*/

public class Exercise_8
{
	public static void main(String[] args) 
	{
		double radius = 5.5;
		System.out.println("Perimeter: " + (2 * radius * Math.PI));
		System.out.println("Area: " + (radius * radius * Math.PI));
	}
}

