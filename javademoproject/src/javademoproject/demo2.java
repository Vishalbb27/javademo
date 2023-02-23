package javademoproject;

public class demo2 {
	public static void main(String[] args) {
		System.out.println("From main");
		method1();
		method2();
		demo2 dem3=new demo2();
		dem3.method3();
	}
	static void method1() {
		System.out.println("From static method1");
	}
	static void method2() {
		System.out.println("From static method2");
	}
	void method3() {
		System.out.println("From non static method");
	}
}
