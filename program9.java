package com.day1;

import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n1= sc.nextInt();
	System.out.println("enter second number");
	int n2 = sc.nextInt();
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println("After swapping:");
	System.out.println("First number :"+n1);
	System.out.println("second number :"+n2);
	}

}
