package javademoproject;

public class datatypes {
	static byte a=50;
	public static void main(String[] args) {
//		datatypes dtd=new datatypes();
//		System.out.println(dtd.a);
		a=(byte)128;
		short b=150;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		float f=1.23f;
		System.out.println(f);
		double g=12345.689;
		System.out.println(g);
	}
}
