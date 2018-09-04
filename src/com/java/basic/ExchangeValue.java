package com.java.basic;

public class ExchangeValue {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a + " " + b);
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a + " " + b);

	}

}
