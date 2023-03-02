package arrayDemo;

public class replace {
	public static void main(String[] args) {
		int[] arr={2,5,3,4,3,5,3,5};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==5) {
				if(arr[i-1]==3) {
					arr[i]=0;
				}
			}
		}
		printArray(arr);
		sumofEvenNumbersInArray(arr);
		chararray();
	}
	

	
	private static void sumofEvenNumbersInArray(int a[]) {
		int sum=0;
		for(int i:a) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println("\n");
	}
	
	private static void chararray() {
		char[] c= {'a','z','b','q'};
		String s1="hello world";
		String result=" ";
		for(char x:s1.toCharArray()) {
			result=x+result;
		}
		System.out.println(result);
	}
}
