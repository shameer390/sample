package com.fork;

import java.util.Scanner;

public class Factorial {

	static void fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n);
	}

}
