/*
*Exercise 1_4: Write a program that displays the following table:
* a 	a^2 	a^3
* 1		1		1
* 2		4		8
* 3		9		27
* 4		16		64
* Programmer: Elizabeth Lee
* Book:Introduction to Java Programming - Y. Daniel Liang
*/

public class Exercise_4
{
	public static void main(String[] args) 
	{
		System.out.println("a\ta^2 \ta^3");
		for(int x=1; x<5; x++)
		{
			System.out.println((x) + "\t" + (x * x) + "\t" + (x * x * x));
		}
	}
}
