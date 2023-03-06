package threadingdemo;

public class ThreadCommunicationDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 mythread = new MyThread1();
		Thread t = new Thread(mythread);
		t.setName("T1");
		t.start();
		synchronized (t) {
			Utils.printmessage("going to wait");
			t.wait();
			Utils.printmessage("Notified");
			Utils.printmessage("Total = " + mythread.total);
		}
	}
}

class MyThread1 implements Runnable {

	int total;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("Calculating Sum");

		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			Utils.printmessage("Calculation completed.. Notifying");
			this.notify();
			System.out.println(total);
		}

	}

}