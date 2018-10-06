package exercise2_1;
/* 
 * Exercise 2_1: Write a program that reads a Celsius degree in a double value from the console ,
 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * fahrenheight = (9 / 5) * celsisus + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
import java.util.Scanner;
public class Exercise2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		int degreesInCelsius = input.nextInt();
		double degreesInFahrenheit = (9.0 / 5) * degreesInCelsius + 32;
		System.out.println(degreesInCelsius + " Celsius is " + degreesInFahrenheit + " Fahrenheit");
	}

}











