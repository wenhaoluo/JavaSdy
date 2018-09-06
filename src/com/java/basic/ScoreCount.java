package com.java.one;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class ScoreCount {
	public static void main(String[] args) {
		int n0,n60,n80,n90;
		n0 = n60 = n80 = n90 = 0;
		while(true) {
			String win = JOptionPane.showInputDialog("请输入学生成绩：(负数为输入完毕)");
			float score = Float.parseFloat(win);
			if(score < 0 ) {
			break;
			}else if(score >= 90) {
				n90++;
				}else if(score >= 80) {
					n80++;
					}else if(score >= 60) {
						n60++;
					}else {
						n0++;
					}
			}
			String str90 = "90-100：" + n90 + "\n";
			String str80 = "80-90：" + n80 + "\n";
			String str60 = "60-80：" + n60 + "\n";
			String str0 = "Not pass：" + n0 + "\n";
			JOptionPane.showMessageDialog(null, "For Each level:" + "\n" + str90 + str80 + str60 + str0);
	}
}
