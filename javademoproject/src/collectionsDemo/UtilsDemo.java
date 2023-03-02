package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilsDemo {
	public static void main(String[] args) {
		collectionsDemo();
	}
	
	private static void ArraysDemo() {
		int[] a= {40,10,15,7};
		for(int i:a)
			System.out.println(i+ " ,");
		System.out.println();
		Arrays.sort(a);
		
		String[] s= {"V","A","Z", "P"};
		List<String> l=Arrays.asList(s);
		System.out.println(l);
	}

	private static void collectionsDemo() {
		List<String> list=new ArrayList<String>();
		list.add("Bob");
		list.add("John");
		list.add("Max");
		list.add("Tom");
		list.add("Lee");
		list.add("Tom");
		
		//Natural ordering
		Collections.sort(list);
		System.out.println(list);
		
		//Using a comparator reversing the list
		Collections.sort(list, new mycomparator());
		System.out.println(list);
		
		//Searching works only when the list is sorted
		int result=Collections.binarySearch(list, "Max");
		System.out.println("Max found at "+result);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}

class mycomparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
