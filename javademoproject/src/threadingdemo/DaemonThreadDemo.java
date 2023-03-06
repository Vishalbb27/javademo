package threadingdemo;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Utils.printmessage(Thread.currentThread().isDaemon());
		Worker1 worker = new Worker1();
		worker.setDaemon(false);
		Utils.printmessage(worker);
		worker.start();
		try {
			worker.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Worker1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			Utils.printmessage(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
