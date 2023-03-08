package searchalgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
		int searchItem=5;
		Arrays.sort(arr);
		int index = binarySearch(arr,searchItem);
		
		
		if(index==-1) {
			System.out.println("Item "+searchItem+" not found");
			
		}
		else {
			System.out.println("Item "+searchItem+" found in index "+index);
		}
	}
	
	private static int binarySearch(int[] arr,int searchItem) {
		
		int m=0,n=arr.length-1;
		int l;
		while(m<n) {
			l=(m+n)/2;
			if(arr[l]==searchItem) {
				return l;
			}
			else if(arr[l]<searchItem) {
				m=m+1;
			}
			else {
				n=n-1;
			}
		}
		return -1;
		
	}
}
