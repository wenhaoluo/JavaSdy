package com.java.basic;

import java.util.Scanner;

public class AssignEmployees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert Employee name:");
		String name = scan.nextLine();
		System.out.println("Please insert your department:");
		String part = scan.nextLine();
		switch (part.hashCode()) {
		case 3254818:
			System.out.println("Employee " + name + " belongs to java department.");
			break;

		case 110968:
			System.out.println("Employee " + name + " belongs to php department.");
			break;

		case 99:
			System.out.println("Employee " + name + " belongs to c department.");
			break;
		default:
			System.out.println("Employee " + name + " not belongs to any departments.");
		}
		scan.close();
	}
}
