package javademoproject;

public class loops {
	public static void main(String args[]) {
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello World");
		}
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		int sum=0;
		for(int i=1;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		for(int j=10;j>0;j-=2) {
			System.out.println(j);
		}
		System.out.println("---------");
		for(int j=10;j>0;j-=2) {
			System.out.println(j);
			if(j<5)
				break;
			else
				continue;
		}
		
		System.out.println("----------\nWhile Loop");
		int i=1;
		while(i<6) {
			i++;
			System.out.println("Hello World");
		}
		
	}
}
