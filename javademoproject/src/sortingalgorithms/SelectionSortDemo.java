package sortingalgorithms;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] numbers = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
		System.out.println("Before sorting : " + Arrays.toString(numbers));
		System.out.println("After sorting : " + Arrays.toString(selectionSort(numbers)));
	}

	static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int indexOfSmallest = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[indexOfSmallest]) {
					indexOfSmallest = j;
				}
			}
			int temp = array[i];
			array[i] = array[indexOfSmallest];
			array[indexOfSmallest] = temp;
		}
		return array;
	}
}
