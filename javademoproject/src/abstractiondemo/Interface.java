package abstractiondemo;

public class Interface {
	public static void main(String[] args) {
		Honda honda=new Honda();
		honda.go();
	}
}

interface Car1{
	void go();
	void stop();
}

class Honda implements Car1{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Inside Honda.go()..");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Inside Honda.stop()..");
	}
	
}