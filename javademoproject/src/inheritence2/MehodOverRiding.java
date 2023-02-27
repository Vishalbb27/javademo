package inheritence2;

public class MehodOverRiding {
	void MethodOverRiding(){
		System.out.println("This is a MOR constructor");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.fuel();
		Bike bike=new Bike();
		bike.fuel();
		Bus bus=new Bus();
		bus.fuel();
	}
	
}

class Vehicle{
	int a,b;
	Vehicle(int a,int b){
		this.a=b;
		this.b=b;
	}
	void fuel() {
		System.out.println("Petrol");
	}
}

class Bus extends Vehicle{
	int c,d;
	Bus(int c,int d,int a,int b){
		super(a, b);
		this.c=c;
		this.d=d;
	}
	void fuel() {
		super.fuel();
		System.out.println("Diesel"); //Overriding 
	}
	
}
//class Car extends Vehicle{
//	int c,d;
//	
//	
//}
//class Bike extends Vehicle{
//	
//}