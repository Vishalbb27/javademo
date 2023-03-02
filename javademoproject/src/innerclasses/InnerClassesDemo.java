package innerclasses;

public class InnerClassesDemo {
	public static void main(String[] args) {
		//Accessing the static method class
		ElectronicDevice.poweron();
		
		//Accessing the static method in the static class
		ElectronicDevice.Chip.brandname();
		
		//Accessing the non static method in the static class
		ElectronicDevice.Chip edc=new ElectronicDevice.Chip();
		edc.specs();
		
		//Accessing the non static method of non static classes
		ElectronicDevice laptop=new ElectronicDevice();
		ElectronicDevice.Processor proc= laptop.new Processor();
		proc.getVoltage();
		
		//Accessing the static method of a non static class
		ElectronicDevice.Processor.gpuName();
	}
	
	
}

class ElectronicDevice{
	static void poweron() {
		System.out.println("Device powered on...");
	}
	
	static class Chip{
		static void brandname() {
			System.out.println("From Sony...");
		}
		void specs() {
			System.out.println("Specified for this chip...");
		}
	}
	
	class Processor{
		static void gpuName() {
			System.out.println("888");
		}
		void getVoltage() {
			System.out.println("Display voltage on the processor..");
		}
	}
}
