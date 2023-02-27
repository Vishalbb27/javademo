package abstractiondemo;

public class AbstractionDemo {
	public static void main(String[] args) {
		ThreeSeries b3=new ThreeSeries();
		b3.accelerate();
		b3.start();
		FiveSeries b5=new FiveSeries();
		b5.accelerate();
		b5.start();
		
		BMW bmw=new ThreeSeries();
		bmw.start();
		bmw.accelerate();
	}
}

abstract class BMW{
	void start() {
		System.out.println("BMW started...");
	}
	abstract void accelerate();
}

interface remote{
	void start();
	void switchoff();
}

class ThreeSeries extends BMW{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Three times accelerates...");
	}
	
	
}
class FiveSeries extends BMW{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Five times accelerates...");
	}
	
	
}