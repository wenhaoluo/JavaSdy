package com.java.basic;

import java.util.Scanner;

public class LeapYearCalculate {

	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the year:");
		year = scan.nextInt();
		try {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("This year is leap year.");
			} else {
				System.out.println("This year is not a leap year.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
