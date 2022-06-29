package com.cg.dataStructureAssignment;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		int num, originalNumber, remainder, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");

		num = sc.nextInt();
		System.out.println("You Entered: " + num);

		originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;

		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}
	}




























//find out if the given number is an armstrong number.
//logic :if 153 is supplied value then 1^3+5^3+3^3=1+125+27=153
//this is the same as supplied value hence it is an armstong number
//package com.cg.assignment01;
//
//public class Armstrong {
//
//	public static void main(String[] args) {
//
//		int number = 153, originalNumber, remainder, result = 0;
//
//		originalNumber = number;
//
//		while (originalNumber != 0) {
//			remainder = originalNumber % 10;
//			result += Math.pow(remainder, 3);
//			originalNumber /= 10;
//		}
//
//		if (result == number)
//			System.out.println(number + " is an Armstrong number.");
//		else
//			System.out.println(number + " is not an Armstrong number.");
//	}
//}
