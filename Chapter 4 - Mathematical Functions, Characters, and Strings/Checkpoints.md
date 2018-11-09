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



















