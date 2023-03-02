package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> intset=new TreeSet<Integer>();
		intset.add(10);
		intset.add(7);
		intset.add(3);
		intset.add(9);
		intset.add(2);
		System.out.println(intset);
	}
}

