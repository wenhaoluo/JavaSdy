package com.java.basic;

public class MultiplicationDemo {

public static void main(String[]args){
	for (int row = 1; row < 10; row++) {
		for (int column = 1; column <= row; column++) {
			System.out.print(row+"*"+column+"="+row*column);
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}