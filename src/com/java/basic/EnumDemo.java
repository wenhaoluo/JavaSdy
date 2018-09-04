package com.java.basic;

class Tomato{
	enum TomatoSize{small,medium,big};
	TomatoSize size;
}

public class EnumDemo {

	public static void main(String[] args) {
		Tomato to = new Tomato();
		to.size = Tomato.TomatoSize.big;
	}

}
