package Encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Car car=new Car();
		car.setColor("black");
		System.out.println(car.getColor());
		System.out.println(car.getNumOfWheels());
		
	}
}

class Car{
	private String colour;
	private int numofwheels;
	private boolean customisable;
	public static String manufacturer="Honda";
	public Car() {
		numofwheels=4;
		colour="white";
		customisable=true;
	}
	public String getColor() {
		return this.colour;
	}
	public int getNumOfWheels() {
		return this.numofwheels;
	}
	
	public void setColor(String colour) {
		if(customisable) {
			this.colour=colour;
		}
	}
	public void setNumOfWheels(int numofwheels) {
		if(customisable) {
			this.numofwheels=numofwheels;
		}
	}
}