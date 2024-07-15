package com.day1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
		}
	}

}
