# Chapter 2 Checkpoints

## 2.1 Identify and fix the errors in the following code:
```
public class Test {
	public void main(string[] args){
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;

		System.out.println("j is " + j  + " and
		k is " + k);
	}
}
```
Corrected code - capitalize 'string' and since a string cannot cross lines in source code, create 2 separate strings and concatenate them
```Java
public class Checkpoint2_1
{
	public void main(String[] args){
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;

		System.out.println("j is " + j  + " and" +
		 "k is " + k);
	}
}
```

*(Liang, p. 36)*


## 2.2 How do you write a statement to let the user enter a double value from the keyboard? What happens if you entered 5a when executing the following code?
```Java
	double radius = input.nextDouble();
```

first you must import a scanner
```Java
import java.util.Scanner;
```
then create a scanner
```Java
Scanner input = new Scanner(System.in);
```
and finally assign the input value to a variable
```Java
	double radius = input.nextDouble();
```

If you entered 5a, you would get a runtime error

*(Liang, p. 38-39)*


## 2.3 Are there any performance differences between the following two import statements?
```Java
	import java.util.Scanner;	//Specific import
	import java.util.*;			//wildcard import
```
No, there is no difference.

*(Liang, p. 38)*


## 2.4 Which of the following identifiers are valid? Which are java keywords?	miles, Test, a++, --a, 4#R, $4, #44, apps, class, public, int, x, y, radius
valid identifiers: miles, Test, $4, apps, x, y, radius  
invalid identifiers: a++, --a, 4#R, #44  
java keywords: class, public, int  

*(Liang, p. 39-40)*


## 2.5 Identify and fix the errors in the following code:
```
public class Test {
  public static void main(String[] args) {
  	int i = k + 2;
  	System.out.println(i);
  }
}
```
Identify errors:  
variable k is not declared  
Corrected code:  
```Java
public class Test {
  public static void main(String[] args) {
  	int k = 0;
  	int i = k + 2;
  	System.out.println(i);
  }
}
```


## 2.6 Identify and fix the errors in the following code:
```
public class Test {
	public static void main(String[] args) {
		int i = j = k = 2;
		System.out.println(i + " " + j + " " + k);
	}
}
```
Identified errors: You cannot declare *and* initialize multiple variables that way.  
Corrected code:
```Java
public class Test {
	public static void main(String[] args) {
		int i, j, k;
		i = j = k = 2;
		System.out.println(i + " " + j + " " + k);
	}
}
```


## 2.7 What are the benfits of using constants? Declare an int constant SIZE with value 20.
The benefits of using constants is:
(1) If a value is used multiple times, you only have to type it once  
(2) If you need to change the constant value, you only need to change it in a single location in the source code (which also lowers the chance of errors - missing some constant values)  
(3) Makes a program easier to read

*(Liang, p.43)*


## 2.8 What are the naming conventions for class names, method names, constants, and variables? Which of the following items can be a constant, a method, a variable, or a class according to the Java namin conventions? MAX_VALUE, Test, read, readDouble
- Class names: Capitalize the first letter of each word  
- Method names, variable names: use lowercase letters. If a name consists of multiple words, make the first word lowercase and capitalize the first letter of each subsequent word.  
-constants: Capitalize all letters and use underscores to separate words

*(Liang, p. 44)*

MAX_VALUE can be a constant  
Test can be a class  
read can be a method or variable  
readDouble can be a method or variable  


## 2.9 Translate the following algorithm into Java code: 
Step 1: Declare a double variable named miles with initial value 100.  
Step 2: Declare a double constant name KILOMETERS_PER_MILE with value 1.609.  
Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.  
Step 4: Display kilometers to the console.  
What is kilometers after Step 4?

```Java
public static void main(String[] args)
{
	double miles = 100;
	final double KILOMETERS_PER_MILE = 1.609;
	double kilometers = miles * KILOMETERS_PER_MILE;
	System.out.println(kilometers);
}

```
kilometers is equal to 160.9



## 2.10 Find the largest and smallest byte, short, int, long, float, and double. Which of these data types requires the least amount of memory?
byte: smallest = -2<sup>7</sup>, largest = 2<sup>7</sup> - 1  
short: smallest = -2<sup>15</sup>, largest = 2<sup>15</sup> - 1  
int: smallest = -2<sup>31</sup>, largest = 2<sup>31</sup> - 1  
long: smallest = -2<sup>63</sup>, largest = 2<sup>63</sup> - 1  
float: smallest = 1.4E-45, largest = 3.4028235E38  
double: smallest = 4.9E-324, largest = 1.7976931348623157E308  

bytes require the least amount of memory
-----Least memory------  
byte = 8 bit signed  
short = 16 bit signed  
int = 32 bit signed  
long = 64 bit signed  
float = 64 bit signed  
double = 64 bit signed  
------Most memory------

*(Liang, p. 45)*



## 2.11 Show the result of the following remainders.
56 % 6 	= 2  
78 % -4 = 2  
-34 % 5 = -4  
5 % 1 	= 0  
1 % 5 	= 1  

*(Liang, p. 46)*


## 2.12 If today is Tuesday, what will be the day in 100 days?
(2 + 100) % 7 = 4 >> Thursday

*(Liang, p. 47)*


## 2.13 What is the result of 25/4? How would you rewrite the expression if you wished the result to be a floating point number?
25 / 4 = 6
25.0 / 4 = 6.25

*(Liang, p. 46)*


## 2.14 Show the result of the following code:
```Java
System.out.println(2 * (5 / 2 + 5 / 2));
System.out.println(2 * 5 / 2 + 2 * 5 / 2);
System.out.println(2 * (5 / 2));
System.out.println(2 * 5 / 2);
```
Results:  
8  
10  
4  
5  


## 2.15 Are the following statements correct? If so, show the output.
```Java
System.out.println("25 / 4 is " + 25 / 4);
System.out.println("25 / 4.0 is " + 25 / 4.0);
System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
```
Yes  
Output:  
25 / 4 is 6  
25 / 4.0 is 6.25  
3 * 2 / 4 is 1  
3.0 * 2 / 4 is 1.5  


## 2.16 Write a statement to display the result of 2<sup>3.5</sup>
```Java
System.out.println(Math.pow(2.0, 3.5));
```

*(Liang, p. 48)*


## 2.17 Suppose **m** and **r** are integers. Write a Java expression for mr<sup>2</sup> to obtain a floating point result.
```Java
int m = 5;
int r = 2;
System.out.println(Math.pow(m, r));
```


## 2.18 How many accurate digits are stored in a float or double type variable?
float type variable: 7-8 digits  
double type variable: 15-17 digits

*(Liang, p. 49)*


## 2.19 Which of the following are correct literals for floating-point numbers? 12.3, 12.3e+2, 23.4e-2, 20.5, 39F, 40D
They are all correct literals. (floating-point numbers are any numbers with a decimal point)

*(Liang, p. 49)*


## 2.20 Which of the following are the same as 52.534? 5.2534e+1, 0.52534e+2, 525.34e-1, 5.2534e+0
Same: 5.2534e+1, 525.34e-1  
Not the same: 5.2534e+0

*(Liang, p. 49-50)*


## 2.21 Which of the following are correct literals? 5_2534e+1, \_2534, 5\_2, 5\_  
Correct literals: 2534e+1, 5_2  
Incorrect: \_2534, 5\_  

*(Liang, p. 50)*


## 2.22 How would you write the following arithmetic expression in Java?
a. 		4		 				 3 + d(2 + a)
	----------	-	9(a + bc) + --------------	
	3(r + 34)						a + bd

a. \frac{4}{3(r + 34)} - 9(a + bc) + \frac{3 + d(2 + a)}{a + bd}

b. 5.5 * (r + 2.5)<sup>2.5 + t</sup>

**Answer**
```
a. (4 / (3(r+34))) - (9(a + bc)) + ((3 + d(2 + a)) / (a + bd))

b. 5.5 * Math.pow((r + 2.5), (2.5 + t))
```

*(Liang, p. 50-51)*


## 2.23 How do you obtain the current second, minute, and hour?

1. Obtain the total milliseconds since midnight, January 1, 1970, in totalMilliseconds by invoking System.currentTimeMillis() (e.g., 1203183068328 milliseconds).
2. Obtain the total seconds totalSeconds by dividing totalMilliseconds by 1000 (e.g., 1203183068328 milliseconds / 1000 = 1203183068 seconds).
3. Compute the current second from totalSeconds % 60 (e.g., 1203183068 seconds % 60 = 8, which is the current second).
4. Obtain the total minutes totalMinutes by dividing totalSeconds by 60 (e.g., 1203183068 seconds / 60 = 20053051 minutes).
5. Compute the current minute from totalMinutes % 60 (e.g., 20053051 minutes % 60 = 31, which is the current minute).
6. Obtain the total hours totalHours by dividing totalMinutes by 60 (e.g., 20053051 minutes / 60 = 334217 hours).
7. Compute the current hour from totalHours % 24 (e.g., 334217 hours % 24 = 17, which is the current hour).

*(Liang, p. 52-53)*


## 2.24 Show the output of the following code:
```Java
 double a = 6.5;
 a += a + 1;
 System.out.println(a);
 a = 6;
 a /= 2;
 System.out.println(a);
```

 output:
```
14.0
3.0
```

*(Liang, p. 54)*


## 2.25 Which of these statements are true?
a. Any expression can be used as a statement.
b. The expression x++ can be used as a statement
c. The statement x = x + 5 is also an expression.
d. The statement x = y = x = 0 is illegal.

They are all true statements

## 2.26 Show the output of the following code:
```Java
int a = 6;
int b = a ++;
System.out.println(a);
System.out.println(b);
a = 6;
b = ++a;
System.out.println(a);
System.out.println(b);
```
Output:
```
7
6
7
7
```

## 2.27 Can different types of numeric values be used together in a computation?
Yes, different types of numeric values can be used together in a computation.

*(Liang, p. 56)*


## 2.28 What does an explicit casting from a double to an int do with the fractional part of the double value? Does casting change the variable being cast?
The fractional part of the double value is truncated. 
Casting does not change the variable being cast.

*(Liang, p. 57)*


## 2.29 Show the following output:
```Java
float f = 12.5F;
int i = (int)f;
System.out.println("f is " + f);
System.out.println("i is " + i);
```
Output:
```
f is 12.5
i is 12
```


## 2.30 If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100 in line 11 in Listing 2.8, what will be the output of the input purchase amount of 197.55?
```Java
//Listing 2.8 SalesTax.java
import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();

		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
	}
}

```
output:
```Java
//The cents(fractional portion) is truncated
Sales tax is $11
```


## 2.31 Show the output of the following code:
```Java
double amount = 5;
System.out.println(amount / 2);
System.out.println(5 / 2);
```
Output:
```
2.5
2
```


## 2.32




