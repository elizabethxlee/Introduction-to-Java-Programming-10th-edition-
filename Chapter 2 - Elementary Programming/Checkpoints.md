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
byte: smallest = -2^7, largest = 2^7 - 1
short: smallest = -2^15, largest = 2^15 - 1
int: smallest = -2^31, largest = 2^31 - 1
long: smallest = -2^63, largest = 2^63 - 1
float: smallest = 
double:

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



