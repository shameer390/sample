package com.fork;

import java.util.Scanner;

public class CountWords {

	static void countWords(String line) {
		int count =1;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("no'of words= "+count);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		countWords(line);
	}

}
