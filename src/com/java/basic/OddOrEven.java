package com.java.basic;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert an number:");
		int num = scan.nextInt();
		String check = (num % 2 == 0) ? "This is Even number" : "This is Odd nubmer";
		System.out.println(check);
		scan.close();
	}

}
