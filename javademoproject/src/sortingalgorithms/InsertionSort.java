package sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(99);
		numbers1.add(44);
		numbers1.add(5);
		numbers1.add(86);
		numbers1.add(4);
		numbers1.add(6);
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		System.out.println("After Sorting: " + insertionSort(numbers1));
	}

	static List<Integer> insertionSort(List<Integer> array) {
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i) <= array.get(0)) {
				array.add(0, array.get(i));
				array.remove(i + 1);
			} else {
				if (array.get(i) < array.get(i - 1)) {
					for (int j = 1; j < i; j++) {
						if (array.get(i) < array.get(j)) {
							array.add(j, array.get(i));
							array.remove(i + 1);
						}
					}
				}
			}
		}

		return array;
	}
}
