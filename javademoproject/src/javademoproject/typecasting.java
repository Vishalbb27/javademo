package javademoproject;

public class typecasting {
	public static void main(String args[]) {
		byte b=100;
		int a =65;
		//implicit casting = casting happens automatically
		a=b;
		System.out.println(a);
		
		//explicit casting = Type must be specified
		b=(byte) a;
		System.out.println(b);
		
		long l=a;
		
		char ch='a';
		System.out.println(ch);
		
		int x=ch;
		System.out.println(x);
	}
}
