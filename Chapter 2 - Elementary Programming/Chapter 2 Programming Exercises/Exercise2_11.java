/* 
 * Exercise 2_11: Rewrite programming Exercise 1.11 to prompt the user to enter the number of years and
 * displays the population after the number of years. Use the hint in Programming Exercise 1.11 for this
 * program. The population should be cast into an integer. 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise2_11;

import java.util.Scanner;

public class Exercise2_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: " );
		int years = input.nextInt();
		double sec_in_year = years * (365.0 * 24 * 60 * 60);
		double current_population = 312032486;
		double birth = sec_in_year / 7; // number of births in a year
		double death = sec_in_year / 13; // number of deaths in a year
		double immigrants = sec_in_year / 45; // number of immigrants in a year
		current_population = current_population + birth + immigrants - death;
		System.out.print("The population in " + years + " years is " +  current_population);
	}

}
