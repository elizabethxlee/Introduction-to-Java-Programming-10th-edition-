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


## 5.8 Do the following two loops result in the same value in sum?
```
for(int i = 0; i < 10; ++i){
	sum += i;
}
```

```
for (int i = 0; i < 10; i++){
	sum += i;
}
```
Yes, the two loops result in the same value in sum;


## 5.9 What are the three parts of a for loop control? Write a for loop that prints the numbers from 1 to 100.  
(1) initial action
(2) loop continuation condition
(3) action after each iteration

*(Liang, p. 171)*

```
for(int i = 1; i < 101; i++)
{
	System.out.println(i);
}
```


## 5.10 Suppose the input is 2 3 4 5 0. What is the output of the following code?
```Java
import java.util.Scanner;

public class Test{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number, sum = 0, count;

		for(count = 0; count < 5; count++)
		{
			number = input.nextInt();
			sum += number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);
	}
}
```
The output is: 
sum is 14
count is 5


## 5.11 What does the following statement do?
```Java
for ( ; ; )
{
	//Do something
}
```
This creates an infinite loop.
*(Liang, p. 172-173)*


## 5.12 If a variable is declared in a for loop control, can it be used after the loop exits?
No, the scope of the variable is only within the loop.


## 5.13 Convert the following for loop statement to a while loop and to a do-while loop:
```Java
long sum = 0;
for(int  i = 0; i <= 1000; i++)
	sum = sum + i;
```

while loop:
```Java
long sum = 0;
int i = 0;
while (i <= 1000)
{
	sum += i;
	i++;
}
```

do while loop:
```Java
long sum = 0;
int i = 0;
do{
	sum += i;
	i++;
} while (i <= 1000);
```


## 5.14 Count the number of iterations in the following loops  
(a)
```Java
int count = 0;
while(count < n){
	count++;
}

```
The number of iterations is n times.

(b)
```Java
for (int count = 0; count <=n; count++){

}

```
The number of iterations is n+1 times.

(c)
```Java
int count = 5;
while(count < n){
	count++;
}

```
The number of iterations is n-5 times.


(d)
```Java
int count = 5;
while (count < n){
	count = count + 3;
}

```
The number of iterations is (n-5)/3 times.


## 5.15 Can you convert a for loop to a while loop? List the advantages of using for loops.
Yes, you can convert a for loop to a while loop.
For loops have a pretest condition and they also limit the number of repetitions in advance.
*(Liang, 174)*


## 5.16 Can you always convert a while loop into a for loop? Convert the following while loop into a for loop.
```Java
int i = 1;
int sum = 0;
while(sum < 10000)
{
	sum = sum + i;
	i++;
}

```
Yes, a while loop can always be converted into a for loop. 
*(Liang, p. 174)*
```Java
int sum = 0;
for(int i = 1; sum < 10000; i++)
{
	sum = sum + i;
}

```


## 5.17 Identify and fix the errors in the following code:
```Java
public class Test {
	public void main(String[] args) {
		for (int i = 0; i < 10; i++); // semicolon should not be included at the end of for statement
			sum += i;

		if (i < j);	//semicolon should not be included at the end of if statement
			System.out.println(i);
		else
				System.out.println(j);
		while (j < 10);	//semicolon should not be included at the end of while statement
		{				// inconsistent formatting
			j++;
		}
		do {
			j++;
		} while(j < 10) //semicolon should be included after a do while statement
	}
}

```
corrected version
```Java
public class Test {
	public void main(String[] args) {
		for (int i = 0; i < 10; i++) 
			sum += i;

		if (i < j)	
			System.out.println(i);
		else
				System.out.println(j);
		while (j < 10){				
			j++;
		}
		do {
			j++;
		} while(j < 10);
	}
}

```


## 5.18 What is wrong with the following programs?
```Java
public class ShowErrors{
	public static void main(String[] args){
		int i = 0;
		do {
			System.out.println(i + 4);
			i++;
		}
		while(i < 10) // Needs to include a semicolon at the end of this line
	}
}

```

```Java
public class ShowErrors{
	public static void main(String[] args){
		for (int i = 0; i < 10; i++); //Should not include a semicolon at the end of this line
			System.out.println(i + 4);
	}
}
```


## 5.19 How many times is the println statement executed?  
```Java
for(int i = 0; i < 10; i++)
	for(int j = 0; j < i; j++)
		System.out.println(i * j)
```
It is executed 45 times.


## 5.20 Show the output of the following programs. (Hint: Draw a table and list the variables in the columsn to trace these programs.)
```Java
public class Test{
	public static void main(String[] args){
		for (int i = 1; i < 5; i++)
			int j = 0;
		while (j < i) {
			System.out.print(j + " ");
			j++;
		}
	}
}

```
The output is 0 0 1 0 1 2 0 1 2 3 

```Java
public class Test{
	public static viod main(String[] args){
		int i = 0;
		while (i < 5) {
			for(int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;
		}
	}
}

```
The output is 
****  
****  
2 ****  
3 2 ****  
4 3 2 ****  

```Java
public class Test{
	public static void main(String[] args){
		int i = 5;
		while (i >=1){
			int num = 1;
			for (int j = 1; j <= i; j++){
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
	}
}
```
The output is 
1xxx2xxx4xxx8xxx16xxx  
1xxx2xxx4xxx8xxx  
1xxx2xxx4xxx  
1xxx2xxx  
1xxx  


```Java
public class Test{
	public static void main(String[] args){
		int i = 1;
		do{
			int num = 1;
			for(int j = 1; j <= i; j++){
				System.out.print(num + "G");
				num += 2;
			}
			System.out.println();
			i++;
		}while(i <= 5);
	}
}

```
The output is  
1G  
1G3G  
1G3G5G  
1G3G5G7G  
1G3G5G7G9G  


## 5.21 Will the program work if n1 and n2 are replaced by n1 / 2 and n2 / 2 in line 17 in Listing 5.9?  
No, it will not work


## 5.22 In Listing 5.11, why is it wrong if you change the code (char)(hexValue + '0') to hexValue + '0' in line 21?  
By removing (char), there is a possibility of loss of precision.


## 5.23 In Listing 5.11 how many times is the loop body executed for a decimal number 245 and how many times is the loop body executed for a decimal number 3245?  
For 245, the loop body is executed twice, resulting in the hex number F5.  
For 3245, the loop body is executed three times, resulting in the hex number CAD.  


## 5.24 What is the keyword break for? What is the keyword continue for? Wll the following programs terminate? If so, give the output.  
The keyword break is used to immediately terminate a loop.  
The keyword continue is used to end the current iteration and go to the end of the loop body.  
*(Liang, 184)*  

```Java
int balance = 10;
while(true){
	if(balance < 9)
		break;
	balance = balance - 9;
}
System.out.println("Balance is " + balance);

```
Yes, the program will terminate. The output is:  
Balance is 1

```Java
int balance = 10;
while(true){
	if(balance < 9)
		continue;
	balance = balance - 9;
}
System.out.println("Balance is " + balance);
```
No, this program will not terminate.


## 5.25 The for loop on the left is converted into the while loop on the right. What is wrong? Correct it.
```Java
int sum = 0;
for(int i = 0; i < 4; i++){
	if(i % 3 == 0) continue;
	sum += i;
}
```
converted to (wrong conversion)
```Java
int i = 0, sum = 0;
while(i < 4){
	if(i % 3 == 0) continue;
	sum += i;
	i++;
}
```
The problem is that in the converted program, if i % 3 == 0, then you will be caught in an infinite loop. To correct it:
```Java
int i = 0, sum = 0;
while(i < 4){
	if(i % 3 == 0){
		i++;
		continue;
	}
	sum += i;
	i++;
}
```

## 5.26 Rewrite the programs TestBreak and TestContinue in Listings 5.12 and 5.13 without using break and continue.
```Java
//Listing 5.12 TestBreak rewritten
public class TestBreak{
	public static void main(String[] args){
		int sum = 0;
		int number = 0;

		while(number < 20 && sum < 100){
			number++;
			sum += number;
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}

```
```Java
//Listing 5.13 TestContinue rewritten
public class TestContinue{
	public static void main(String[] args){
		int sum = 0;
		int number = 0;

		while(number < 20){
			number++;
			if(number != 10 && number != 11)
				sum += number;
		}
		System.out.println("The sum is " + sum);
	}
}
```


## 5.27 After the break statement in (a) is executed in the following loop, which statement is executed? Show the output. After the continue statement in (b) is executed in the following loop, which statement is executed? Show the output.

```Java
for (int i = 1; i < 4; i++){
	for (int j = 1; j <4; j++){
		if (i * j > 2)
			break;

		System.out.println(i * j);
	}
	System.out.println(i);
}
```
After the break statement, System.out.println(i * j) is executed. The output is:  
1  
2  
1  
2  
2  
3  

```Java
for (int i = 1; i < 4; i++){
	for(int j = 1; j < 4; j++){
		if (i * j > 2)
			continue;

		System.out.println(i * j);
	}
	System.out.println(i);
}
```
After the continue statement is executed, System.out.println(i * j); is executed. The output is: 
1  
2  
1  
2  
2  
3  





