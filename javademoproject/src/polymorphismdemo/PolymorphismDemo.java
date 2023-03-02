package polymorphismdemo;

public class PolymorphismDemo {
	public static void main(String[] args) {
		CompileTimePolymorphism ctp=new CompileTimePolymorphism();
		ctp.add(1, 3);
		ctp.add(1.25f, 3.71f);
		ctp.add(9, 8, 4);
		ctp.add("x", "y");
	}
}

class CompileTimePolymorphism{
	void add(String string,String string2) {
		String result=string+string2;
		System.out.println("Addition of 2 Strings = "+result);
	}
	void add(int a,int b) {
		int result=a+b;
		System.out.println("Addition of 2 numbers = "+result);
	}
	void add(float a,float b) {
		float result=a+b;
		System.out.println("Addition of 2 non-integers = "+result);
	}
	void add(int a,int b,int c) {
		int result=a+b+c;
		System.out.println("Addition of 3 numbers = "+result);
	}
}