package com.fork;

import java.util.Scanner;

public class FibonacciSeries {
	
	static void fib(int n) {
		int a=0,b=0,c=1;
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fib(n);
	}

}
