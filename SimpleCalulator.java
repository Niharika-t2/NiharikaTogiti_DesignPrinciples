package com.simpleCalculator;

import java.util.Scanner;
public class SimpleCalulator extends Operations {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		Operations ob1 = new Operations();
		int value1, value2, option;
		System.out.println("Input first number :");
		value1 = ob.nextInt();
		System.out.println("Input second number :");
		value2 = ob.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Select any operation");
		option=ob.nextInt();
		switch(option) {
		case 1:System.out.println("Resultant value="+add(value1,value2));
				break;
		case 2:System.out.println("Resultant value="+subtract(value1,value2));
				break;
		case 3:System.out.println("Resultant value="+multiply(value1,value2));
				break;
		case 4:System.out.println("Resultant value="+divide(value1,value2));
				break;
		default:System.out.println("Invalid selection");
		}
	}

}
