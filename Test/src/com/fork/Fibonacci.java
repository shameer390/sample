package com.fork;

import java.util.Scanner;

public class Fibonacci {
	
	static void missingNum(int n,int array[]) {
		int array1[]=new int[n];
		int a=0,b=0,c=1;
		for (int i = 0; i < n; i++) {
			if(i==0 || i==1)
				array1[i]=i;
			else {
				a=b;
				b=c;
				c=a+b;
				array1[i]=c;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array1[i]!=array[i])
				System.out.println("Missing number is:"+array1[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array:");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		sc.close();
		missingNum(n, array);
		
	}

}
