package threadingdemo;

public class ChallengeDemo {
	public static void main(String[] args) {
//		EvenNumbers en=new EvenNumbers(10);
		
		int n=10;
		for(int i=1;i<=10;i++) {
			Utils.printmessage(""+i);
		}
		
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=n;i++) {
					if(i%2!=0) {
						Utils.printmessage(""+i);
					}
				}
			}
		};
		myThread my=new myThread();
		Thread t1=new Thread(my);
		t1.start();
		
		Thread t2=new Thread(r1);
		t2.start();
	}
}

class myThread implements Runnable{

	@Override
	public void run() {
			EvenNumbers en=new EvenNumbers(10);
			en.method();
		}
	
}

//Create a thread to print odd numbers between 0 to 10
//Create another thread to print even numbers between 0 to 10
//From the main thread,print all the numbers from 0 to 10 and start 

class EvenNumbers{
	int n;
		EvenNumbers(int n){
			this.n=n;
		}
		public void method() {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				Utils.printmessage(""+i);
			}
		}
	}
}

//class OddNumbers{
//	int n;
//	OddNumbers(int n){
//		this.n=n;
//	}
//	
//	for(int i=0;i<=n;i++) {
//		if(i%2==0) {
//			Utils.printmessage(""+i);
//		}
//	}
//}