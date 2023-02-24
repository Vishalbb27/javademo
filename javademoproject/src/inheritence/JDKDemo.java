package inheritence;

//multi-level inheritence
public class JDKDemo {
	public static void main(String[] args) {
		JDK8 jdk8=new JDK8();
		jdk8.f1();
		jdk8.f2();
	}
}

class JDK6{
	JDK6(){
		System.out.println("Installing JDK6");
	}
	void f1() {
		System.out.println("Inside JDK6 F1 method");
	}
}

class JDK7 extends JDK6{
	JDK7(){
		System.out.println("Installing JDK7");
	}
	void f2() {
		System.out.println("Inside JDK7 F2 method");
	}
}
class JDK8 extends JDK7{
	JDK8(){
		System.out.println("Installing JDK8");
	}
}
