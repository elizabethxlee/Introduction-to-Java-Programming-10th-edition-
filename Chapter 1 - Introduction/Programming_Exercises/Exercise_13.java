/*
* Exercise 1_13: You can use Cramer's rule to solve the following
* 2 x 2 system of linear equation:
*	ax + by = e 		ed - bf 		af - ec
*			    x = --------	    y = --------
*	cx + dy = f 		ad - bc 		ad - bc
* Write a program that solves the following equation and displays
* the value for x and y:
* 	3.4x + 50.2 y = 44.5
*	2.1x + 0.55y = 5.9
*/

public class Exercise_13
{
	public static void main(String[] args) 
	{	
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		System.out.println("x = " + ((e * d) - ( b * f)) / ((a * d) - (b * c)));
		System.out.println("y = " + ((a * f) - ( e * c)) / ((a * d) - (b * c)));
	}
}
