package inheritence2;

public class constructorchaining {
	public static void main(String[] args) {
//		 ChildClass cc=new ChildClass(10);
		 ChildClass cc=new ChildClass();
	}
}

class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No args super class constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("One arg superclass constructor");
	}
}

class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor called");
	}
	ChildClass(int y){
//		this();
		super(y);
		System.out.println("args child class constructor called");
	}
	
}
