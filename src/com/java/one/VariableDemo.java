package com.java.one;

public class VariableDemo {
	static int a = 10;
	int b;
	public void print() {
		b = 20;
		System.out.println("��print�У�ȫ��a="+a+"�� "+"ȫ��b="+b);
		int c = 30;
		System.out.println("��print�У��ֲ�c="+c);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		VariableDemo var = new VariableDemo();
		System.out.println(var.b);
		var.print();
	}
}
