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


## Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
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






