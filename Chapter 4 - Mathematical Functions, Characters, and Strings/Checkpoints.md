# Chapter 4 Checkpoints

## 4.1 Evaluate the following method calls:  
(a) Math.sqrt(4)=2  
(b) Math.sin(2 * Math.PI) = -2.4492935982947064E-16    
(c) Math.cos(2 * Math.PI) = 1.0  
(d) Math.pow(2,2) = 4  
(e) Math.log(Math.E) = 1.0  
(f) Math.exp(1) = 2.718281828459045  
(g) Math.max(2, Math.min(3,4)) = 3  
(h) Math.rint(-2.5) = -2.0  
(i) Math.ceil(-2.5) = -2.0  
(j) Math.floor(-2.5) = -3.0  
(k) Math.round(-2.5f) = -2  
(l) Math.round(-2.5) = -2  
(m) Math.rint(2.5) = 2.0  
(n) Math.ceil(2.5) = 3.0  
(o) Math.floor(2.5) = 2.0  
(p) Math.round(2.5f) = 3  
(q) Math.round(2.5) = 3  
(r) Math.round(Math.abs(-2.5)) = 3  


## 4.2 True or false? The argument for trigonometric methods is an angle in radians  
True
*(Liang, p. 121)*


## 4.3 Write a statement that converts 47 degrees to radians and assigns the result to a variable  
```Java
double radians = Math.toRadians(47);
```


## 4.4 Write a statement that converts pi/7 to an angle in degrees and assigns the result to a variable
```Java
double degrees = Math.toDegrees(Math.PI / 7);
```


## 4.5 Write an expression that obtains a random integer between 34 and 55. Write an expression that obtains a random integer between 0 and 999. Write an expression that obtains a random number between 5.5 and 55.5.
//General: a + Math.random() * b --> returns a random number between a and a+b, excluding a+b
```
34 + (int)Math.random() * (55 - 34)  
(int)Math.random() * 1000;  
5.5 + Math.random() * (55.5 - 5.5)
```
*(Liang, p. 122)*

## 4.6 Why does the Math class not need to be imported?  
It does not need to be imported because it is in the java.lang package. It is implicitly imported.  
*(Liang, p. 124)*


## 4.7 What is Math.log(Math.exp(5.5))? What is Math.exp(Math.log(5.5))? What is Math.asin(Math.sin(Math.PI / 6))? What is Math.sin(Math.asin(Math.PI / 6))?  
Math.log(Math.exp(5.5)) = 5.5  
Math.exp(Math.log(5.5)) = 5.5  
Math.asin(Math.sin(Math.PI / 6)) = 0.5235987755982988  
Math.sin(Math.asin(Math.PI / 6)) = 0.5235987755982988  


## 4.8 Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'. Use print statements to find out the character for the decimal codes 40, 59, 79, 85, and 90. Use print statements to find out the character for the hexadecimal code 40, 5A, 71, 72, and 7A.  
```Java
System.out.println((int)'1');  
System.out.println((int)'A');
System.out.println((int)'B');
System.out.println((int)'a');
System.out.println((int)'b');

System.out.println((char)40);
System.out.println((char)59);
System.out.println((char)79);
System.out.println((char)85);
System.out.println((char)90);

System.out.println((char)0X40);
System.out.println((char)0X5A);
System.out.println((char)0X71);
System.out.println((char)0X72);
System.out.println((char)0X7A);
```

## 4.9 Which of the following are correct literals for characters? '1', '\u345dE', '\u3fFa', '\b', '\t'  
'1', '\u3fFa', '\b', and '\t' are correct literals for characters.  
'\u345dE' is an incorrect literal for characters. 

## 4.10 How do you display the characters \ and "?
Include a backslash before the the character.
*(Liang, 126)*

## 4.11 Evaluate the following:  
int i = '1';  
int j = '1' + '2' * ('4' - '3') + 'b' / 'a';  
int k = 'a';  
char c = 90;  

## 4.12 Can the following conversions involving casting be allowed? If so, find the converted result.  
char c = 'A';  
int i = (int)c;  
yes, the converted result is 65

float f = 1000.34f;
int i = (int)f;  
yes, the converted result is 1000

double d = 1000.34;  
int i = (int)d;  
yes, the converted result is 1000  

int i = 97;  
char c = (char)i;  
yes, the converted result is 97  

## 4.13 Show the output of the following program:
```Java
public class Test {
	public static void main(String[] args){
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(++y);
		System.out.prinln(x - y);
	}
}
```

## 4.14 Write the code that generates a random lowercase letter.
```Java
	double letter = 97 + Math.random() * (122-97);
	System.out.println((char)letter);
```

## 4.15 Show the output of the following statements:  
System.out.println('a' < 'b'); --> true  
System.out.println('a' <= 'A'); --> false  
System.out.println('a' > 'b'); --> false  
System.out.println('a' >= 'A'); --> true  
System.out.println('a' == 'a'); --> true  
System.out.println('a' != 'b'); --> true  


















