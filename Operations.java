package com.simpleCalculator;

public class Operations {
	public static int add(int val1,int val2) {
		return val1 + val2;
	}
	public static int subtract(int val1,int val2) {
		return val1 - val2;
	}
	public static int multiply(int val1,int val2) {
		return val1 * val2;
	}
	public static int divide(int val1,int val2) {
		if(val2 == 0) {
			throw new ArithmeticException("Divide by zero");
		} else {
		return val1 / val2;
		}
	}
}
