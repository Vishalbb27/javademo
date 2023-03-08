package searchalgorithm;

public class LinearSearchDemo {
	public static void main(String[] args) {
		
		int[] arr = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
		int searchItem=5;
		int index = linearSearch(arr,searchItem);
		
		if(index==-1) {
			System.out.println("Item "+searchItem+" not found");
			
		}
		else {
			System.out.println("Item "+searchItem+" found in index "+index);
		}
	}
	private static int linearSearch(int [] arr,int searchItem) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchItem) {
				return i;
			}
		}
		return -1;
	}
}
