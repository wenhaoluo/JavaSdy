package com.java.one;

import java.util.Scanner;

public class PersonalTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		System.out.println("Salary = " + salary);
		if(salary > 2000.0) {
			System.out.println("Done!");
		}else {
			System.out.println("Free!");
		}
	}

}
