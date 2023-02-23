package javademoproject;

public class javanonstaticdemo {
	public javanonstaticdemo() {
		System.out.println("From consturctor");
	}
	{
		System.out.println("From non-static-block-1");
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		javanonstaticdemo jnd=new javanonstaticdemo();
	}
}
