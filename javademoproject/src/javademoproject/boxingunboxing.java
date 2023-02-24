package javademoproject;

public class boxingunboxing {
	public static void main(String[] args) {
		int i=10;
		Integer a=new Integer(10);
		
		byte b=7;
		Byte b1=8;
		
		Integer x=5;
		
		Integer a1=new Integer(50);
		int z=a1;
		System.out.println(z);
		
		Integer y=200;
		if(y>100) { //Internal unboxing 
			System.out.println(y);
		}
	}
	
}
