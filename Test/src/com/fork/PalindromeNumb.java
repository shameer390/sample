package com.fork;

import java.util.Scanner;

public class PalindromeNumb {

	static void palinNum(int n) {

		int a=n,lastDigit,sum=0;
		while(n!=0) {
			lastDigit=n%10;
			sum=sum*10+lastDigit;
			a=a/10;
		}
		if(n==a)
			System.out.println("pali");
		else
			System.out.println("not pali");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		palinNum(n);
	}

}
