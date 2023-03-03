package threadingdemo;

import java.util.Scanner;

public class JoinDemo {
	
	public static void main(String[] args) {
		
		Utils.printmessage("Sum of first 'N' ");
		Utils.printmessage("Enter a value: ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long starttime=System.currentTimeMillis();
		Calculator calc=new Calculator(n);
		calc.start();
		
		
		try {
			calc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.printmessage("Sum of first "+n+" numbers = "+calc.getSum());
		
		long endtime=System.currentTimeMillis();
		System.out.println("Total time take: "+(endtime-starttime)/1000+"seconds");
	}
	
	
}

class Calculator extends Thread{
	
	int n;
	int sum;
	
	Calculator(int n){
		this.n=n;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"- ");
		for(int i=1;i<=n;i++) {
			this.sum+=i;
		}
	}
	
	public int getSum() {
		return sum;
	}
}

