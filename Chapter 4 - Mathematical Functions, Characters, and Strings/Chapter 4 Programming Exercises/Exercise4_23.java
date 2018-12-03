/*
 * Exercise 4_23: Write a program that reads the following information and prints a payroll statement
 * Employee's name
 * Number of hours worked in a week
 * Hourly pay rate
 * Federal tax withholding rate
 * State tax withholding rate
 * 
 * Programmer: Elizabeth Lee
 * Book: Introduction to Java Programming - Y. Daniel Liang
 */
package exercise4_23;
import java.util.Scanner;


public class Exercise4_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = payRate*hoursWorked;
		double totalDeduction = (grossPay*federalTaxRate) + (grossPay*stateTaxRate);
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.printf("Pay rate is:  $%1.2f", payRate);
		System.out.printf("\nGross Pay: $%1.2f", grossPay);
		System.out.println("\nDeductions: ");
		System.out.printf("\tFederal Withholding (%1.2f%%): $%1.2f", federalTaxRate*100, grossPay*federalTaxRate);
		System.out.printf("\n\tState Withholding(%1.2f%%): $%1.2f", stateTaxRate*100, grossPay*stateTaxRate);
		System.out.printf("\n\tTotal Deduction: $%1.2f", totalDeduction);
		System.out.printf("\nNet Pay: $%1.2f", grossPay-totalDeduction);
	}
}
