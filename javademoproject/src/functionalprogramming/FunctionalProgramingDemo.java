package functionalprogramming;

import threadingdemo.Utils;

public class FunctionalProgramingDemo {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.calculate(2, 3);
		//Anonymous function
		ICalculator multiplier = new ICalculator() {

			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				int result = a * b;
				System.out.println("Calculate " + a + " * " + b + " = " + result);
				return 0;
			}

		};
		multiplier.calculate(10, 15);
		int x = 15;
		int y = 10;
		
		//Lambda expression
		ICalculator divider = (a, b) -> {
			return a / b;
		};
		System.out.println("Calcuate " + x + " / " + y + " = " + divider.calculate(x, y));
		
		sum sum=(a,b) -> System.out.println("Sum is "+(a+b));
		sum.clac(17, 3);
	}
}

interface ICalculator {
	int calculate(int a, int b);
}

class Calculator implements ICalculator {

	@Override
	public int calculate(int a, int b) {
		System.out.println("This is being claculated.");
		return a + b;
	}

}

interface sum{
	void clac(int a,int b);
}