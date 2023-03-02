package exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
//		divideByZeroDemo();
		StringParserDemo();
		nullPointerDemo();
	}
	
	private static void StringParserDemo() {
		String s="hello";
		try {
			int i=Integer.parseInt(s);
			System.out.println("converted integer = "+i);
		}
		catch(Exception e) {
			System.out.println("Cannot convert words to integer");
		}
		
	}
	
	private static void nullPointerDemo() {
		String s="";
		try {
			int i=Integer.parseInt(s);
			System.out.println("converted integer = "+i);
		}
		catch(Exception e) {
			System.out.println("String is empty enter a valid string");
		}
	}

	private static void divideByZeroDemo() {
		int a,b;
		float c,d;
		System.out.println("Enter 2 numbers...");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("The value inputted by user = "+a);
		System.out.println("The value inputted by user = "+b);
		try {c=a/b;
		d=a%b;
		System.out.println(a+"/"+b+" = "+c +", Remainder = " +d);
		System.out.println("End of Calculator.");
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception occurred. "+ex.getMessage());
		}
	}
}
