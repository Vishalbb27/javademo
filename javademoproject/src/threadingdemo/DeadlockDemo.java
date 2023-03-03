package threadingdemo;

public class DeadlockDemo {
	
	public static void main(String[] args) {
		
		FirstResource fr=new FirstResource();
		SecondResource sr=new SecondResource();
		
		ResourceWorker rw=new ResourceWorker(fr,sr);
		Thread t=new Thread(rw);
		t.start();
		sr.method1(fr);
		
	}

}

class ResourceWorker implements Runnable{
	
	FirstResource fr;
	SecondResource sr;
	
	ResourceWorker(FirstResource fr,SecondResource sr){
		this.fr=fr;
		this.sr=sr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class FirstResource{
	public void method1(SecondResource sr) {
		
		Utils.printmessage("Inside FirstResouce.mehtod1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoking SecondResource.mehtod2");
		sr.method2();
	}
	public synchronized void method2() {
		
	}
}

class SecondResource{
	
	public void method1(FirstResource fr) {
		Utils.printmessage("Inside FirstResouce.mehtod1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoking SecondResource.mehtod2");
		fr.method2();
	}
	public void method2() {
		Utils.printmessage("SecondResouce.method2");
	}
}