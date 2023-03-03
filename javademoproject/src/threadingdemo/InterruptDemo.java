package threadingdemo;

public class InterruptDemo {
	public static void main(String[] args) {
		Utils.printmessage("Start");
		
		Thread t=new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(5000);
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.printmessage("End");
	}
}

class Worker implements Runnable{

	@Override
	public void run() {
		Utils.printmessage("Start");
		for(int i=0;i<=10;i++) {
			Utils.printmessage(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Utils.printmessage("Thread interrupted");
				
			}
		}
		Utils.printmessage("End");
	}
	
}