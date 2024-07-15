package com.day1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		int i,number;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		boolean isPrime = false;
		if(number<=1)
		{
			isPrime=false;
		}
		else
		{
			for(i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println(number+"is prime number");
		}
		else
		{
			System.out.println(number+"is not a prime number");
		}
		
	}

}
