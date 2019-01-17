# Chapter 6 Checkpoints 

## 6.1 What are the benefits of using a method? 
Methods allow you to reuse code and organize and simplify coding.  
*(Liang, p. 204)*   

## 6.2 How do you define a method? How do you invoke a method?  
You define a method by specifying the modifier, return value type, method name, parameters, and method body.  
*(Liang, p. 204-205)*  
If a method returns a value, you can invoke a method by treating it as a value.  
If a method does not return a value, you can invoke the method by using it as a statement.  
*(Liang, p. 206)*

## 6.3 How do you simplify the max method in Listing 6.1 using the conditional operator?  
```Java
public class TestMax {
	/**Main method*/
	public static void main(String[] args){
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j " is "  + k);
	}

	/** Return the max of two numbers */
	public static int max(int num1, int num2) {
		int result;
		return = (num1 > num2) ? num1 : num2;
	}
}
```

## 6.4 True or false? A call to a method with a void return type is always a statement itself, but a call to a value-returning method cannot be a statement by itself. 


## 6.5 What is the return type of a main method?  

## 6.6 What would be wrong with not writing a return statement in a value-returning method? Can you have a return statement in a void method? Does the return statement in the following method cause syntax errors?
```Java
public static void xMethod(double x double y){
	System.out.println(x + y);
	return x + y;
}
```

## 6.7 Define the terms parameter, argument, and method signature.  
A parameters are the variables that are defined in the method header.  
An argument is the value that is passed to the parameter.  
The method signature is the method name and parameter list.  
*(Liang, p. 205)*  

## 6.8 Write method headers(not the bodies) for the following methods:  
a. Return a sales commission, given the sales amount.
```
public static double getCommission(double sales amount, double commissionRate)
```
b. Display the calendar for a month, given the month and year.  
```
public static void print(int month, int year)
```
c. Return a square root of a number. 
```
public static double squareRoot(double num)
``` 
d. Test whether a number is even, and returning true if it is.  
```
public static boolean evenNumber(int num)
```
e. Display a message a specified number of times.  
```
public static void messagePrint(String message, int numTimes)
```
f. Return the monthly payment, given the loan amount, number of years, and annual interest rate. 
```
public static double monthlyPayment(double loanAmount, int numYears, double interestRate)
``` 
g. Return the corresponding uppercase letter, give a lowercase letter.  
```
public static char upperCase(char lowerCase)
```

## 6.9 Identify and correct the errors in the following program:  
```Java
public class Test{
	public static method(int n, m){
		n += m;
		method2(3.4);
	}

	public static int method2(int n){
		if(n > 0 ) return 1;
		else if(n==0) return 0;
		else if(n < 0) return -1;
	}
}
```
corrected:
```Java
public class Test{
	public static void method(int n, int m) {
		n += m;
		method2(3.4);
	}

	public static int method2(double n){
		if(n > 0 ) 
			return 1;
		else if(n==0) 
			return 0;
		else (n < 0) 
			return -1;
	}
}
```

## 6.10 Reformat the following program according to the programming style and documentation guidelines proposed in Section 1.9, Programming Style and Documentation. Use the next-line brace style.
```Java
public class Test{
	public static double method(double i, double j)
	{
		while(i < j) {
			j--;
		}

	return j;
	}
}
```
Rewritten:
```Java
public class Test
{
	public static double method(double i, double j)
	{
		while(i < j)
		{
			j--;
		}
		return j;
	}
}

```





















