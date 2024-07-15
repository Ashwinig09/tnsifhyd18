package com.day1;
import java.util.Scanner;
public class Program3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fatorial of"+number+"is:"+fact);
		
	}

}
