package com.java.basic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class PrintInRedirect {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("./log.txt");
			System.setIn(in);

			Scanner scan = new Scanner(System.in);
			String line = " ";
			while (scan.hasNextLine()) {
				line = scan.nextLine();
				System.out.println("The context for file are " + line);
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
