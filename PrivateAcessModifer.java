package com.day1;

public class PrivateAcessModifer {
	
	private void display()
	{
	System.out.println("TNS Sessions");
	}
	public static void main(String args[])
	{
		PrivateAcessModifer obj = new PrivateAcessModifer();
	//trying to access private method of another class
	obj.display();
	}
	}


