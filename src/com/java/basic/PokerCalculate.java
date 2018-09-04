package com.java.basic;

public class PokerCalculate {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 13; j++) {
				for (int m = 1; m <= 13; m++) {
					for (int n = 1; n <= 13; n++) {
						if (i + j + m + n == 24) {
							count++;
							System.out.println(i + " " + j + " " + m + " " + n);
						}
					}
				}
			}
		}
		System.out.print("Count for 24 = " + count);
	}

}
