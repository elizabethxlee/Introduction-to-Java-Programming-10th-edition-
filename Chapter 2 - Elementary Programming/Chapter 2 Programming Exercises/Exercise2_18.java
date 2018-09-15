/* 
 * Exercise 2_18: Write a program that displays the following table. Cast floating-point numbers into integers.
 * 		a		b		pow(a,b)
 * 		1		2		1
 * 		2		3		8
 * 		3		4		81
 * 		4		5		1024
 * 		5		6		15625
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_18;

public class Exercise2_18 {

	public static void main(String[] args) {
		System.out.println("a\tb\tpow(a, b)");
		for(int x=1; x<6; x++)
		{
			System.out.println((x) + "\t" + (x + 1) + "\t" + (int)(Math.pow(x, (x + 1))));
		}
	}
}
