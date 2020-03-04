package com.fork;

import java.util.Scanner;

public class EvenOrOdd {
	
	static void evenOdd(int i) {
		
		if(i%2==0)
			System.out.println(i+"is an even number ");
		else
			System.out.println(i+"is an odd number");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		evenOdd(i);
	}

}
