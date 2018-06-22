# Chapter 1 Checkpoints

## 1.1 - What are hardware and software?
Hardware is the visible / physical elements of a computer.
Software is the instructions that control the hardware and allow it to perform specific tasks.

*(Liang, p. 2)*


## 1.2 - List five major hardware components of a computer
5 major hardware components:
  * A central processing unit (CPU)
  * Memory (main memory)
  * Storage devices (such as disks and CDs)
  * Input devices (such as the mouse and keyboard)
  * Output devices (such as monitors and printers)
  * Communication devices (such as modems and network interface cards)

*(Liang, p. 2)*


## 1.3 - What does the acronym "CPU" stand for?
CPU stands for central processing unit.

*(Liang, p. 3)*


## 1.4 - What unit is used to measure CPU speed?
Today, CPU speed is measured in megahertz (MHz).

*(Liang, p. 3)*


## 1.5 - What is a bit? What is a byte?
A bit is a digit (0 or 1) in the binary number system.
A byte is the minimum storage unit in a computer. It is made of 8 bits.

*(Liang, p. 3)*


## 1.6 - What is memory for? What does RAM stand for? Why is memory called RAM?
Memory is for storing programs along with the data used within those programs.
RAM stands for random-access memory.
Memory is called RAM because each byte in memory has a unique address and can be accessed in any order.

*(Liang, p. 4)*


## 1.7 - What unit is used to measure memory size?
Today's computers' memory sizes are generally measured in gigabytes.
  * Kilobyte = approx. 1,000 bytes
  * Megabyte = approx. 1,000,000 bytes
  * Gigabyte = approx. 1,000,000,000 bytes
  * Terabyte = approx. 1,000,000,000,000 bytes

*(Liang, p. 4)*


## 1.8 - What unit is used to measure disk size?
Disk size is usually measured in gigabytes or terabytes.

*(Liang, p. 5)*


## 1.9 - What is the primary difference between memory and a storage device?
Memory is volatile - any information stored in memory is lost once the system is powered off.
Storage devices permanently store data and can transfer data to memory.

*(Liang, p. 4)*


## 1.10 What language does the CPU understand?
The CPU's native language is machine language, which come in the form of binary code.

*(Liang, p. 7)*


## 1.11 What is an assembly language?
An assembly language is a language that uses mnemonics (short descriptive words) to represent machine-language instructions.

*(Liang, p. 7)*


## 1.12 What is an assembler?
An assembler is used to translate assembly-language programs into machine code (because computers cannot execute assembly language, only machine language).

*(Liang, p. 7)*


## 1.13 What is a high-level programming language?
High-level programming languages are platform-independent languages -- languages that allow you to run programs in different types of machines.

*(Liang, p. 8)*


## 1.14 What is a source program?
A source program (or *source code*) is a program that is written in a high-level language.

*(Liang, p. 8)*


## 1.15 What is an interpreter?
An interpreter is a tool that translates source code into machine code by reading one statement, translating it to machine code, then executing immediately.

*(Liang, p. 8)*


## 1.16 What is a compiler?
A compiler is a tool that translates source code into machine code by translating the entire source code into a machine-code file, then executing the machine-code file.

*(Liang, p. 8)*


## 1.17 What is the difference between an interpreted language and a compiled language?
An interpreted language is translated and executed one statement at a time while a compiled language is an entire source code translated into machine-code file which is then executed.

*(Liang, p. 9)*


## 1.18 What is an operating system? List some popular operating systems.
The operating system is a programt hat manages and controls the computer's activites.

Some popular operating systems are:
  * Microsoft Windows
  * Mac OS
  * Linux

  *(Liang, p. 9)*


## 1.19 What are the major responsibilites of an operating system?
The major respnsibilities of an operating system are: : 
  * Controlling and monitoring system activities
  * Allocating and assigning system resources
  * Scheduling operations

 *(Liang, p. 9)*


## 1.20 What are multiprogramming, multithreading, and multiprocessing?
Multiprogramming allows multiple programs to run simultaneously by sharing the same CPU.

Multithreading allows a single program to execute multiple tasks at the same time.

Multiprocessing uses two or more processors to perfrom subtasks concurrently and then combine solutions of the subtasks to obtain a solution for the entire task.

 *(Liang, p. 9)*


## 1.21 Who invented Java? Which company owns Java now?
Java was created by James Gosling and his team from Sun Microsystems.

Java is now owned by Oracle.

 *(Liang, p. 10)*


## 1.22 What is a Java applet?
An applet is a program that can be run from a Web browser.

 *(Liang, p. 11)*


## 1.23 What programming language does Android use?
Android software is developed using Java.

 *(Liang, p. 11)*


## 1.24 What is the Java language specification?
Java language specification is the technical definition of the Java programming language's syntax and semantics.

 *(Liang, p. 11)*


## 1.25 What does JDK stand for?
JDK stands for Java Development Toolkit and is the software for developing and running Java programs.

 *(Liang, p. 12)*


## 1.26 What does IDE stand for?
IDE is an integrated development environment for rapidly developing programs.

 *(Liang, p. 12)*


## 1.27 Are tools like NetBeans and Eclipse different languages from Java, or are they dialects or extensions of Java?
No, NetBeans and Eclipse are not different languages from Java.
They are software that provide an IDE for developing Java programs quickly.

 *(Liang, p. 12)*


## 1.28 What is a keyword? List some Java keywords.
Keywords are words that have a specific meaning to the compiler and cannot be used for other purposes in the program.

Some Java keywords are:
  * class
  * public
  * static
  * void

  *(Liang, p. 13)*


## 1.29 Is Java case sensitive? What is the case for Java keywords?
Yes, Java programs are case sensitive.
Java keywords are also case sensitive.

*(Liang, p. 13)*


## 1.30 What is a comment? Is the comment ignore by the compiler? How do you denote a comment line and a comment paragraph?
A comment is text that help prgorammers to communicate and understand the program

A comment is ignored by the compiler because it is not a programming statement.

A comment line is denoted by 2 slashes (//) before the commentary text
A comment paragraph is denoted by /&ast before commentary text and &ast/ after commentary text.

*(Liang, p. 13)*


## 1.31 What is the statement to display a string on the console?
The statement to display a message on the console is 
```
System.out.println(...);
```

*(Liang, p. 14)*


## 1.32 Show the output of the following code: 
```Java
public class Test{
	public static void main(String[] args) {
		System.out.println("3.5 * 4 / 2 - 2.5 is ");
		System.out.println(3.5 * 4 / 2 - 2.5);
	}
}
```
The output is:
```
3.5 * 4 / 2 - 2.5 is 
4.5
```

## 1.33 What is the Java source filename extension, and what is the Java bytecode filename extension?
The Java source filename extension is **.java**.
The Java bytecode filename extension is **.class**.

*(Liang, p. )*


## 1.34 What are the input and output of a Java compiler?

*(Liang, p. )*


## 1.35 What is the command to compile a Java program?

*(Liang, p. )*


## 1.36 What is the command to run a Java program?

*(Liang, p. )*


## 1.37 What is the JVM?

*(Liang, p. )*


## 1.38 Can Java run on any machine? What is needed to run Java on a computer?

*(Liang, p. )*


## 1.39If a NoClassDefFoundError occurs when you run a program, what is the cause of
the error?

*(Liang, p. )*


## 1.40 If a NoSuchMethodError occurs when you run a program, what is the cause of the error?

*(Liang, p. )*




## References
Liang, Y. D. (2015).*Introduction to JAVA programming: Comprehensive version* (10th ed.). Upper Saddle River, NJ: Pearson/Prentice Hall.