package javademoproject;

public class javanonstaticdemo {
	public javanonstaticdemo() {
		System.out.println("From consturctor");
	}
	static{
		System.out.println("from static block");
	}
	{
		System.out.println("From non-static-block-1");
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		javanonstaticdemo jnd=new javanonstaticdemo();
		javanonstaticdemo jnd1=new javanonstaticdemo();
		Car car=new Car();
		System.out.println(car.numofwheels);
		System.out.println(Car.manufacturer);
	}
}
