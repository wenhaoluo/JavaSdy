package com.java.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeLevels {

	public static void main(String[] args) throws IOException {
		float score;
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(io);
		System.out.println("Please input your score :");
		String input = read.readLine();
		score = Float.parseFloat(input);
		System.out.println("Your score is:" + score);
		
//		if(score < 60) {
//			System.out.println("Low");
//		}else if(score >= 60 && score < 80) {
//			System.out.println("Medium");
//		}else if(score >= 80) {
//			System.out.println("Good");
//		}

		switch((int)(score/10)){
		case 10:
			System.out.println("Nice!");
			break;
		case 8:
			System.out.println("Not bad!");
			break;
		case 6:
			System.out.println("So so!");
			break;
		default:
			System.out.println("Rubbish!");
			break;
		}
	}
}
