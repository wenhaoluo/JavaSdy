package com.java.basic;

import java.io.PrintStream;

public class PrintOutRedirect {
	public static void main(String[] args) {
		try {
			PrintStream out = System.out;
			PrintStream in = new PrintStream("./log.txt");
			System.setOut(in);
			System.out.println("tomato");
			System.out.println("This is redirect for system.out.println");
			System.setOut(out);
			System.out.println("Redirect test finish.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
