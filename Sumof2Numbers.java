package com.app;

import java.util.Scanner;

public class Sumof2Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println("Sum  of the given numbers are :-  " + c);
		
		
	}

}
