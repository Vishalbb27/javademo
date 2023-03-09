package calculator;

import java.util.Scanner;

public class Calculator {
	
	private final int num1;
	private final int num2;
	
	Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	private double calculate(int ch) {
		int result = 0;
		switch(ch) {
		case 1: result=num1+num2;
		break;
		case 2: result=num1-num2;
		break;
		case 3: result=num1*num2;
		break;
		case 4:
			try {
				result=num1/num2;
			}catch(Exception e) {
				System.out.println("Division by zero error.");
			}
			break;
		default:
			System.out.println("Please enter correct choice\n");
			break;
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numbers for calculation : ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		Calculator calc=new Calculator(num1,num2);
		System.out.println("1.Add\n2.Subtract\n3.Multiplication\n4.Division\n");
		System.out.println("Enter your choice : ");
		int ch=scanner.nextInt();
		double result = calc.calculate(ch);
		System.out.println("Result = "+result);
	}
}
