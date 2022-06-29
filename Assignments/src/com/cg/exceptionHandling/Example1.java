//write an application that accepts two numbers ,divides the first number by with the second number and 
//display the result.(hint:u need to handle Arithmatic exception which is thrown when there is an attempt 
//to divide a number by zero)

package com.cg.exceptionHandling;

import java.util.Scanner;

public class Example1 {
public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
System.out.println("The numerator is :");
		int numerator = sc.nextInt();
System.out.println("The dinominator is :");
		int dinominator = sc.nextInt();
		sc.close();
double division = numerator / dinominator;
System.out.println("The division of two number is :" + division);
}
catch (ArithmeticException e) {
		System.out.println("Divided by zero operation cannot possible");
		}

}
}


	


