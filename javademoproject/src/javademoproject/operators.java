package javademoproject;

public class operators {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		//arithmatic operators
		int result=a+b;
		System.out.println(result);
		result=a-b;
		result=a/b;
		result=a*b;
		result=a%b;
		
		//unary operators
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(--a);
		
		boolean isSelected=false;
		if(!isSelected) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		//Relational operators
		//<,>,!=
		//Logical operators =&& ||
		int age = 16;
		boolean drivingClassesAttended=true;
		if(age>15 && drivingClassesAttended) {
			System.out.println("License Issued.");
		}
		else {
			System.out.println("Come later");
		}
		
		//Ternary operator
		String license=(age <15 && drivingClassesAttended ?"License Issued":"Not Issued");
		System.out.println(license);
		int p=5;
		int q=10;
		System.out.println(p>q?q:p);
		
		//assignment opearator
		q+=5;
		System.out.println(q);
		p-=3;
		System.out.println(p);
	}
}
