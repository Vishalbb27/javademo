package threadingdemo;

public class ThreadingDemo {
	public static void main(String[] args) {
		SingleThreaded st=new SingleThreaded();
		st.printNumbers();
		MultiThreaded mt=new MultiThreaded();// This creates a new thread
		mt.start();
		
	}
}


class SingleThreaded{
	void printNumbers() {
		
		for(int i=1;i<=200;i++) {System.out.println(Thread.currentThread().getName()+" " +i);
		}
	}
	
}

class MultiThreaded extends Thread{
	public void run() {

			
			for(int i=1;i<=200;i++) {System.out.println(Thread.currentThread().getName()+" " +i);
			}
		
	}
}