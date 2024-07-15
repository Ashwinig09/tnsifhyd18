package com.day1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+"is even number");
		}
		else
		{
			System.out.println(a+"is odd number");
		}
		
	}

}
