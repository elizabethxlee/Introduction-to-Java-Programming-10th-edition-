/*
* Exercise 1_12: Assume a runner runs 24 miles in 1 hour, 40 min
* and 35 sec. Write a program that displays the average speed in
* kilometers per hours. (Note: 1 mile = 1.6 km)
*
* Programmer: Elizabeth Lee
* Book: Introduction to Programming - Y. Daniel Liang
*/

public class Exercise_12
{
	public static void main(String[] args) 
	{	
		double distance_ran_miles = 24;
		double km_in_mile = 1.6;
		double distance_ran_km = distance_ran_miles * km_in_mile;
		double hours = 1;
		double minutes = 40.0;
		double seconds = 35.0;
		double total_hours = ((hours) + (minutes / 60) + (seconds/60/60));
		System.out.println("Kilometers per hour is: " + distance_ran_km / total_hours);
	}
}
