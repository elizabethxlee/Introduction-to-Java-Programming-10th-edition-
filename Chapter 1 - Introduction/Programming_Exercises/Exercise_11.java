/*
* Exercise 1_11: The US Census Bureau projects population based on the following assumptions:
* - One birth every 7 seconds
* - One death every 13 seconds
* - One new immigrant every 45 seconds
* Write a program to display the population for each of the next five
* years. Assume the current population is 312,032,486 and one year has 
* 356 days. Hing: In Java, if 2 integers perform division, the result 
* an integer. The fractional part is truncated. i.e. 5/4 is 1 (not 1.25)
* To get an accurate result with the fractional part, one of the values
* involved in the division must be a number with a decimal point.
*
* Programmer: Elizabeth Lee
* Book: Introduction to Java Programming - Y. Daniel Liang
*/
public class Exercise_11
{
	public static void main(String[] args) 
	{
		double sec_in_year = 365.0 * 24 * 60 * 60;
		double current_population = 312032486;
		double birth = sec_in_year / 7; // number of births in a year
		double death = sec_in_year / 13; // number of deaths in a year
		double immigrants = sec_in_year / 45; // number of immigrants in a year

		for(int x = 1; x < 6; x ++)
		{
			current_population = current_population + birth + immigrants - death;
			System.out.println("Population after " + x + " year(s): " + current_population );
		}
	}
}
