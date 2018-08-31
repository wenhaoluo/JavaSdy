package com.java.one;

public class IfDemo {
	public static void main(String[] args) {
		double salary;
		salary = Double.parseDouble(args[0]);
		System.out.println("您的月工资为:"+salary+"元" );
		if(salary > 2000.0) {
			System.out.println("交税");
		}else
			System.out.println("不用交");
	}
}
