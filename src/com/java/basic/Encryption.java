package com.java.basic;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Input what you wanna encrypt or decrypt : ");
		String in = scan.nextLine();
		char[] pwd = in.toCharArray();
		for (int i = 0; i < pwd.length; i++) {
			pwd[i] = (char) (pwd[i] ^ 200);
		}
		System.out.println("The result for encrypt or decrypt are : " + new String(pwd));
		scan.close();
	}

}
