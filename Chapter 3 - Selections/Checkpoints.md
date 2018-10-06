# Chapter 3 Checkpoints

## 3.1 List six relational operators
The relational operators are 
<
<=
/>
/>=
==
!=

*(Liang, p.76)*


## 3.2 Assuming that x is 1, show the result of the following Boolean expressions:
(x > 0) = True
(x < 0)	= False
(x != 0) = True
(x >= 0) = True
(x != 0) = True


## 3.3 Can the following conversions involving casting be allowed? Write a test program to verify your answer.
boolean b = true;
i = (int)b;

int i = 1;
boolean b = (boolean)i;

```
No, casting integers to booleans (and vice versa) are not allowed.
```

```Java
public class Checkpoint3_3
{
	public static void main (String[] args)
	{
		boolean b = true;
		int i;
		i = int(b);

		int i = 1;
		boolean b = (boolean)i;
	}
}	


```

## 3.4 Write an if statement that assigns 1 to x if y is greater than 0
```
if y > 0 
	x = 1
```

## 3.5 Write an if statement that increases pay by 3% if score is greater than 90
```
if score > 90
	pay = pay + (pay * 0.03)
```


##3.6 Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
```
if (score > 90)
{
	pay = pay + (pay * 0.03);
}
else
{
	pay = pay + (pay * 0.01);
}
```


## 3.7 What is the output of the code in (a) and (b) if number is 30? What if number is 35?
(a) 
```
if (number % 2 == 0)
	System.out.println(number + " is even.");

System.out.println(number + " is odd.");
```
(b)
```
if (number % 2 == 0)
	System.out.println(number + " is even.");
else
System.out.println(number + " is odd.");
```
If number is 30, output is:
(a) 30 is even.
	30 is odd.
(b) 30 is even.

If number is 35, output is:
(a) 30 is even.
	30 is odd.
(b) 30 is odd.


## 3.8 Suppose xx = 3 and y = 2; show the output, if any, of the following code. What is the output if x = 3 and y = 4? What is the output if x =2 and y = 2? Draw a flowchart of the code.


## 3.9 Suppose x = 2 and y = 3. Show the output, if any, of the following code. What is the output if x = 3 and y = 2? What is the output if x = 3 and y = 3?
```
if (x > 2)
	if (y > 2)
	{
		int z = x + y;
		System.out.println("z is " + z):
	}
else
	System.out.println("x is " + x);
```
If x = 2 and y = 3, output will be:
```
x is 2
```

If x = 3 and y = 3, output will be:
```
z is 6
```


## 3.10 What is wrong in the following code?
```
if (score >= 60.0)
	System.out.println("D");
else if (score >= 70.0)
	System.out.println("C");
else if (score >= 80)
	System.out.println("B");
else if (score >= 90)
	System.out.println("A");
else
	System.out.println("F");

```
The problem is that the code will print multiple letters if the score is greater than or equal to 70.
i.e. a score of 95 will produce the output:
```
D
C
B
A
```


## 3.11 Which of the following statements are equivalent? Which ones are correctly indented?
*(Liang, p. 86)*  
Statements (a), (c), and (d) are equivalent.  
Statements (b) and (c) are correctly indented.


## 3.12 Rewrite the following statement using a Boolean expression:
```Java
	if (count % 10 == 0)
		newLine = true;
	else
		newLine = false;
```
Rewritten:
```Java
	newLine = (count % 10 == 0);
```
*(Liang, p. 86)*


## 3.13 Are the following statements correct? Which one is better?  
(a)
```Java
if (age < 16)
	System.out.println
		("Cannot get a driver's license");
if (age >= 16)
	System.out.println
		("Can get a driver's license");
```
(b)
```Java
if (age < 16) 
	System.out.println("Cannot get a driver's license");
else 
	System.out.println("Can get a driver's license");
```
Yes, both statements are correct. Statement (b) is better.


## 3.14 What is the output of the following code if number is 14, 15, or 30?  
(a)
```Java
if (number % 2 ==0)
	System.out.println(number + " is even");
if (number % 5 == 0)
	System.out.println(number + " is multiple of 5");
```
(b)
```Java
if (number % 2 == 0)
	System.out.println(number + " is even");
else if (number % 5 == 0)
	System.out.println(number + " is multiple of 5");
```
Output for 14:  
(a) 14.0 is even  
(b) 14.0 is even  

Output for 15:  
(a) 15.0 is a multiple of 5  
(b)	15.0 is a multiple of 5  

Output for 30:  
(a) 30.0 is even  
	30.0 is a multiple of 5  
(b) 30.0 is even  


## 3.15 Which of the following is a possible output from invoking Math.random()?
```
323.4 0.5, 34, 1.0, 0.0, 0.234
```
0.5, 0.0, and 0.234 are possible output of invoking Math.random().  
*(Liang, p. 87)*


## 3.16  
(a) How do generate a random integer **i** such that 0 <= i < 20?
```
	System.out.print((int)(Math.random()*20));
```
(b) How do you generate a random integer **i** such that 10 <= i < 20?
```
	System.out.print((int)(Math.random()*10) + 10);
```
(c) How do you generate a random integer  **i** such that 10 <= i < 50?
```
	System.out.print((int)(Math.random()*41) + 10);
```
(d) Write an expresson that returns 0 or 1 randomly.
```
	System.out.print((int)(Math.random()*2));
```


## 3.17 Are the following two statements equivalent?  
(a)
```Java
if (income <= 10000)
	tax = income * 0.1;
else if (income <= 20000)
	tax = 1000 + (income - 10000) * 0.15;
```
(b)
```Java
if (income <= 10000)
	tax = income * 0.1;
else if (income > 10000 & income <=20000)
	tax = 1000 + (income - 10000) * 0.15;
```
Yes, the two statements are equivalent.


## 3.18 Assuming that x is 1, show the result of the following Boolean expressions.  
(true) && (3 > 4) --> FALSE  
!(x > 0) && (x > 0) --> FALSE  
(x > 0) || (x < 0) --> TRUE  

(x != 0) || (x == 0) --> TRUE  
(x >= 0) || (x < 0) --> TRUE  
(x != 1) == !(x == 1) --> TRUE  


## 3.19 (a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100. (b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative.  
(a)
```
(num >= 1) && (num <= 100)
```
(b)
```
((num >= 1) && (num <= 100)) || (num < 0)
```

## 3.20(a) Write a Boolean expression for |x - 5| < 4.5. (b) Write a boolean expression for |x - 5| > 4.5.  
(a)
```
(x - 5) < 4.5 && (x - 5) > -4.5
```
(b)
```
(x - 5) > 4.5 || (x - 5) < -4.5
```


## 3.21 Assume that x and y are int type. Which of the following are legal Java expressions?
x > y > 0 --> not legal  
x = y && y --> not legal  
x /= y --> legal  
x or y --> not legal  
x and y --> not legal  
(x != 0) || (x = 0) --> not legal  


## 3.22 Are the following two expressions the same?  
```
(a) x % 2 == 0 && x % 3 == 0

(b) x % 6 == 0
```
Yes, the two expressions are the same.


## 3.23 What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?  
If x = 45: False  
If x = 67: True  
If x = 101: False  


## 3.24 Suppose, when you run the following program, you enter the input 2 3 6 from the console. What is the output?
The output is  
```
(x < y && y < z) is true
(x < y && y < z) is true
!(x < y) is false
(x + y < z) is true
(x + y > z) is false
```
Reference *(Liang, p.97)* for example program.


## 3.25 Write a Boolean expression that evaluates to true if age is greater than 13 and less than 18.  
```
(age > 13) && (age < 18)
```


## 3.26 Write a Boolean expression that evaluates to true if weight is greather than 50 pounds or height is greater than 60 inches.  
```
(weight > 50) || (height > 60)
```


## 3.27 Write a Boolean expression that evaluates to true if weight is greater than 50 pounds and height is greater than 60 inches.
```
(weight > 50) && (height > 60)
```


## 3.28 Write a Boolean expression that evalues to true if either weight is greater than 50 pounds or height is greater than 60 inches, but not both.  
```
(weight > 50) ^ (height > 60)
```

*(Liang, p.93)*


## 3.29 What data types are required for a switch variable? If the keyword break is not used after a case is processed, what is the next statement to be executed? Can you convert a switch statement to an equivalent if statement, or vice versa? What are the advantages of using a switch statement?  
-The required data types are either char, byte, short, int, or String.  
-If the keyword 'break' is not used after a case statement, the statements starting from the matched case will execute until the end of the switch statement is reached.  
-Yes, you can convert switch statements to an equivalent if statement and vice versa.  
-The advantage of using a switch statement is that it simplifies code and makes it easier to read and maintain.  

*(Liang, p.101)*


## 3.30 What is y after the following switch statement is executed? Rewrite the code using an if-else statement.
```
x = 3; y = 3;
switch (x + 3) {
	case 6: y = 1;
	default: y += 1;
}
```
Rewritten:
```Java
		int x=3;
		int y = 3;
		if (x + 3 == 6)
			y = 1;
		y += 1;
``` 


## 3.31 What is x after the following if-else statement is executed? Use a switch statement to rewrite it and draw the flowchart for the new switch statement.
```
		int x = 1, a = 3;
		/*
		if (a == 1)
			x +=5;
		else if (a == 2)
			x += 10;
		else if (a ==3)
			x += 16;
		else if (a == 4)
			x += 34;
```
Rewritten:
```Java
		int x = 1, a = 3;
		switch(a)
		{
			case 1: x+=5; break;
			case 2: x += 10; break;
			case 3: x += 16; break;
			case 4: x += 34; break;
		
		}
```


## 3.32 Write a switch statment that displays Sunday, Monday, Tuesday Wednesday, Thursday, Firday, Saturday if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
```Java
		switch(day)
		{
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
```


## 3.33 Suppose that, when you run the following program, you enter the input 2 3 6 from the console. What is the output?  
```
public class Test {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();

		System.out.println((x < y && y < z)) ? "sorted" : "not sorted");
	}
}
```
This program uses the conditional expression boolean-expression ? expression1 : expression2;  
*(Liang, p.103)*  
If the input is 2 3 6, the output would be "sorted".  


## 3.34 Rewrite the following if statements using the conditional operator  
```
if (ages >= 16)
	ticketPrice = 20;
else 
	ticketPrice = 10;
```
Rewritten  
```
ticketPrice = (ages >= 16) ? 20 : 10
```


## 3.35 Rewrite the following conditional expressions using if-else statements.    
(a) score = (x > 10) ? 3 * scale : 4 * scale;  
Rewritten:
```Java
	if (x > 10)
	{
		score = 3 * scale;
	}
	else
	{
		score = 4 * scale;
	}
```
(b) tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;  
Rewritten:  
```Java
		if (income > 10000)
		{
			tax = income * 0.2;
		}
		else
		{
			tax = income * 0.17 + 1000;
		}
```
(c) System.out.println((number % 3 == 0) ? i : j);  
Rewritten:  
```Java
	if (number % 3 == 0)
	{
		System.out.println(i);
	}
	else
	{
		Sytem.out.println(j);
	}
```


## 3.36 Write a conditional expression that returns -1 or 1 randomly.
```Java
		double num = Math.random();
		System.out.println((num >= 0.5 ) ? -1 : 1);
```

## 3.37 List the precedence order of the Boolean operators. Evaluate the following expressions:
```
true || true && false
true && true || false
```
The precedence order of Boolean operators is:  
(1) !  
(2) ==, !=
(3) ^  
(4) &&  
(5) ||  
*(Liang, p. 105)*

The expressions evaluated are:
```
true
true
```

## 3.38 True or false? All binary operators except = are left associative.
False. All binary operators except assignment operators are left associative.
*(Liang, p. 105)*


## 3.39 Evaluate the following expressions:
```
2 * 2 - 3 > 2 && 4 - 2 > 5
2 * 2 - 3 > 2 || 4 - 2 > 5
```
Evaluated:
```
false
false
```
*refer to table 3.4 - 3.6 (Liang, p. 93-94)*


## 3.40  
Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?  
Yes  
Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))?
Yes  
Is (x > 0 || x < 10 && y < 0) the same as (x > 0 || (x < 10 && y < 0))?  
Yes  













