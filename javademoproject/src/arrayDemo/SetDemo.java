package arrayDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		randomdemo();
		hashsetdemo();
	}
	private static void randomdemo() {
		Random obj=new Random();
		int x=obj.nextInt(100);
		System.out.println(x);
	}
	private static void hashsetdemo() {
		Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(random.nextInt(1,10));
		}
		System.out.println(list);
		
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		
		Set<Integer> set1=new LinkedHashSet<>(list);
		System.out.println(set1);
		
		Set<Integer> set2=new TreeSet<>(list);
		System.out.println(set2);
	}
}
