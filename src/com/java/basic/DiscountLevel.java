package com.java.basic;

import java.util.Scanner;

public class DiscountLevel {

	public static void main(String[] args) {
		System.out.println("请输入金额：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		float money = Float.parseFloat(str);
		
		String discount = "";
		if(money>=200) {
			int level = (int) (money/200);
			switch(level){
				case 1:
					discount = "9.5";
					break;
				case 2:
					discount = "9";
					break;
				default:
					discount = "6";
					
			}
				
		}else {
			discount = "被打";
		}
		System.out.println("你将享受" + discount + "折的优惠。");
		
		
	}

}
