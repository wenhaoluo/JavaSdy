package com.java.one;

public class IfDemo {
	public static void main(String[] args) {
		double salary;
		salary = Double.parseDouble(args[0]);
		System.out.println("�����¹���Ϊ:"+salary+"Ԫ" );
		if(salary > 2000.0) {
			System.out.println("��˰");
		}else
			System.out.println("���ý�");
	}
}
