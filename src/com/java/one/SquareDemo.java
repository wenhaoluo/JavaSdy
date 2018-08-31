package com.java.one;

import javax.swing.JOptionPane;

public class SquareDemo {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("please enter an number:");
		double d = Double.parseDouble(s);
		double result = d * d;
		JOptionPane.showMessageDialog(null, s + " " + "square result is" + " "+ result);
	}

}
