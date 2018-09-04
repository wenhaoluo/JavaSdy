package com.java.basic;

import java.util.Scanner;

public class Pascal_triangleDemo {

	public static void main(String[] args) {
		System.out.println("请输入杨辉三角行数：");
		Scanner sca = new Scanner(System.in);
		int count = sca.nextInt();
		int num[][] = new int[count][count];
		for(int row=0; row<count; row++) {
			for(int column=0; column<=row; column++) {
				if(column==0 || column==count) {
					num[row][column] = 1;
				}else {
					num[row][column] = num[row-1][column] + num[row-1][column-1];
				}
//				System.out.print(num[row][column]+" ");
			}
//			System.out.println();
		}
		
		for(int row =0; row<count; row++) {
			for(int space =0; space<2*(count - row)-1; space++) {
				System.out.print(" ");
			}
			for(int column=0;column<=row;column++) {
				System.out.printf("%-4d",num[row][column]);
			}
			System.out.println();
		}
		sca.close();
	}
}
