package abstractiondemo;

public final class FinalKeywordDemo {
	
	public static void main(String[] args) {
		final int x=5;
		
		B b=new B();
		b.A();
	}
}

class A{
	final void A() {
		System.out.println("Method A");
	}
}
class B extends A{
	
}
