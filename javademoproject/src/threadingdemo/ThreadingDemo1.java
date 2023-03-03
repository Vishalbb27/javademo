package threadingdemo;

public class ThreadingDemo1 {
	public static void main(String[] args) {
		
		MultiThreaded mt=new MultiThreaded();// This creates a new thread
		mt.start();
		
		SingleThreaded st=new SingleThreaded();
		st.printNumbers();
		
	}
}

class SingleThreaded{
	void printNumbers() {
		for(int i=1;i<=200;i++) { 
			System.out.println(Thread.currentThread().getName()+" " +i);
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MultiThreaded extends Thread{
	public void run() {
		for(int i=1;i<=200;i++) {
			System.out.println(Thread.currentThread().getName()+" " +i);
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}