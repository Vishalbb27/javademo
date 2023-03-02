package MultipleInheritanceDemo;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		TV tv=new TV();
		tv.powerOn();
		
		Monitor monitor=new Monitor();
		monitor.powerOn();
		
		DesktopComputer dc=new DesktopComputer();
		dc.start();
	}
}
class ElectronicDevice{
	void poweron() {
		System.out.println("Device powered on");
		
	}
}

class TV extends ElectronicDevice{
	void powerOn() {
		System.out.println("TV Guide Screen displayed");
	}
}

class Monitor extends ElectronicDevice{
	void powerOn() {
		System.out.println("Black Screen Displayed");
	}
}

class DesktopComputer implements I1,I2{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		I1.super.start();
		I2.super.start();
	}
}
