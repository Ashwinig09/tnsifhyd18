package com.day1;

import java.util.Scanner;

public class program10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num= sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num=num/10;
		
		}
		System.out.println("sum of digits :"+ sum);
	}
}
