package com.java.basic;

import java.util.Scanner;

public class PyramidDemo {

	public static void main(String[] args) {
		System.out.println("请输入金字塔层数");
		Scanner sca = new Scanner(System.in);
		int count = sca.nextInt();
		System.out.println("1：金字塔；2：倒金字塔");
		int mode = sca.nextInt();
		switch(mode) {
		case 1:
			NormalPyramid(count);
			break;
		case 2:
			ReversePyramid(count);
			break;
		default:
			System.out.println("输入错误!");
			break;
		}
		sca.close();
	}

	private static void NormalPyramid(int count) {
		 for (int i = 0; i < count; i++) {
	            for (int space = count - i - 1; space > 0; space--) {
	                System.out.print(space);
	            }
	            for (int node = 0; node < (2 * i + 1); node++) {
	                System.out.print("☺");
	            }
	            System.out.println();
	        }
	    }
	
	private static void ReversePyramid(int count) {
		 for (int i = 0; i < count; i++) {
	            for (int space = 0; space < i; space++) {
	                System.out.print(space);
	            }
	            for (int node = 0; node < (2 * (count - i) - 1); node++) {
	                System.out.print("☺");
	            }
	            System.out.println();
	        }
	    }
}
