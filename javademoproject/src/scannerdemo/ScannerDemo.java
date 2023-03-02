package scannerdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		ScannerDemo();
		ScannerDemo2();
	}
	private static void ScannerDemo2() {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		while(scanner.hasNextInt()) {
			int num=scanner.nextInt();
			sum+=num;
			System.out.println("Enter a number (char to exit) : ");
		}
		System.out.println("Sum: "+sum);
	}
	
	private static void ScannerDemo() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student id : ");
		int id = scanner.nextInt();
		System.out.println("Enter student name : ");
		String name=scanner.next();
		System.out.println("Enter student Score : ");
		double score=scanner.nextDouble();
		System.out.println("Student Details");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
}
