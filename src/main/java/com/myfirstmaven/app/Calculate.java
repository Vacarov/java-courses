package com.myfirstmaven.app;
public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate ...");
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		int sum = num1 + num2;		
		System.out.println("Sum = " + sum);	
	}
}