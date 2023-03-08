package sortingalgorithms;

import java.util.ArrayList;

public class BubbleSortDemo {
	public static void main(String[] args) {
		bubbleSort();
	}

	private static void bubbleSort() {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(0);
		int max=list.get(0);
		int temp;
		long start=System.currentTimeMillis();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			for(int j=0;j<list.size();j++) {
				if(list.get(j)>list.get(i)) {
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(list);
		System.out.println("Execution Time is : "+(end-start));
	}
}
