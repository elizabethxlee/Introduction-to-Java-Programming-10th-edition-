# Chapter 5 Checkpoints

## 5.1 Analyze the following code. Is count < 100 always true, always false, or sometimes true or sometimes false at Point A, Point B, and Point C?  
```Java
int count = 0;
while(count < 100){
	//Point A
	System.out.pritnln("Welcome to Java!");
	count++;
	//Point B
}
// Point C
```
Point A: always True
Point B: sometimes true, sometimes false
Point C: Always false


## 5.2 What is wrong if guess is initialized to 0 in line 11 in Listing 5.3? (pg. 162)  
There can be times when the loop condition is never met and the program will never enter the loop.


## 5.3 How many times are the following loop bodies repeated? What is the output of each loop?
```Java
int i = 1;
while (i < 10)
	if(i % 2 == 0)
		System.out.println(i);
```
This loop body is repeated an infinite amount of times.  

```Java
int i = 1;
while (i < 10)
	if (i % 2 == 0)
		System.out.println(i++);
```
This loop body is repeated an infinite amount of times.  

```Java
int i = 1;
while (i < 10)
	if ((i++) % 2 == 0)
		System.out.println(i);
```
The loop body is repeated 9 times. The output is:
3  
5  
7  
9  


## 5.4 Suppose the input is 2 3 4 5 0. What is the output of the following code?
```java
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number, max;
		number = input.nextInt();
		max = number;

		while (number != 0)
		{
			number = input.nextInt();
			if(number > max)
				max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number is " + number);
	}

}
```
The output is: 
max is 5
number is 0


## 5.5 What is the output of the following code? Explain the reason.
```Java
int x = 80000000;
while(x > 0)
	x++;
System.out.println("x is " + x);
```
The output is x is -2147483648.
This is caused when there is integer overflow.


## 5.6 Suppose the input is 2 3 4 5 0. What is the output of the following code?
```Java
import java.util.Scanner;

public class Test{
	public static void main(String[] args)
	{
		scanner input = new Scanner(System.in);

		int number, max;
		number = input.nextInt();
		max = number;
	
		do
		{
			number - input.nextInt();
			if(number > max)
				max - number;
		} while (number != 0);
		System.out.println("max is " + max);
		System.out.println("number " + number);
	}
}

```
The output is:
max is 5
number 0


## 5.7 What are the differences betweena  while loop and a do-while loop? Convert the following while loop into a do-while loop.
```Java
Scanner input = new Scanner(System.in);
int sum = 0;
System.out.println("Enter an integer " + "(the input ends if it is 0)");
int number = input.nextInt();
while (number != 0)
{
	sum += number;
	System.out.println("Enter an integer " + "(the input ends if it is 0)");
	number = input.nextInt();
}	
```
The difference between a while loop and a do-while loop is that a do-while loop will always execute the body of the loop at least once. A while loop will only execute if the loop condition is met.
```Java
Scanner input = new Scanner(System.in);
int sum = 0;
System.out.println("Enter an integer " + "(the input ends if it is 0)");
int number = input.nextInt();
do
{
	sum += number;
	System.out.println("Enter an integer " + "(the input ends if it is 0)");
	number = input.nextInt();
} while (number != 0);

```
















