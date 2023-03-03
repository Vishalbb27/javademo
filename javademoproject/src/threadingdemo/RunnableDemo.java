package threadingdemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		Utils.printmessage("Start main");
		ImageProcessor ip=new ImageProcessor();
		Thread t=new Thread(ip);
		t.start();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printmessage("Do Some work..");
			}
			
		});
		
		
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printmessage("This is thread3..");
			}
			
		});
		t1.start();
//		t3.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("End main");
	}
}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("Processing an image");
	}
	
}
