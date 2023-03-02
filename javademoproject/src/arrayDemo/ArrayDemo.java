package arrayDemo;

public class ArrayDemo {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		printArray(arr);
		arr[0]=13;
		printArray(arr);
		arr[3]=new Integer(24);
		printArray(arr);
		
//		int x=arr[5];
//		System.out.println(x);
	}
	
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println("\n");
	}
}
