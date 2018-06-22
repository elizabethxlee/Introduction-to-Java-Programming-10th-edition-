/*
* Exercise 1_10: Assume a runner runs 14 kilometers in 45 minutes
* and 30 seconds. Write a program that displays the average
* speed in miles per hours. (Note: 1 mile = 1.6 kilometers)
*
* Programmer: Elizabeth Lee
* Book: Introduction to Java Programming - Y. Daniel Liang
*/
public class Exercise_10
{
	public static void main(String[] args) 
	{
		double distance_ran_km = 14;
		double km_in_mile = 1.6;
		double time_min = 45.5;
		double min_to_hr = time_min / 60;
		double distance_miles = distance_ran_km / km_in_mile;
		
		System.out.println(distance_miles / min_to_hr + " miles per hour");
	}
}