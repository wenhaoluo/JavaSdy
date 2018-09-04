package com.java.basic;

import java.util.Scanner;

public class CheckLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Input username:");
		String username = scan.nextLine();
		System.out.println("Please Input password:");
		String password = scan.nextLine();
		if (!username.equals("tomato")) {
			System.out.println("Username is not right");
		} else if (!password.equals("password")) {
			System.out.println("Password is not right");
		} else {
			System.out.println("All are right!");
		}
		scan.close();
	}

}
