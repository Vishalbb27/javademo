package arrayDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class collectiondemo {
	public static void main(String[] args) {
		
		demo1();
		demo2();
		demo3();

	}
	private static void demo1() {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20.4);
		list.add("Hello");
		System.out.println(list);
	}
	private static void demo2() {
		ArrayList newlist=new ArrayList<String>();
		newlist.add("10");
		newlist.add("hello");
		newlist.add("world");
		System.out.println(newlist);
	}
	private static void demo3() {
		
		LinkedList<Integer> intlist=new LinkedList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			intlist.add(i);
		}
		System.out.println(intlist);
		intlist.set(3,101);
		intlist.remove(2);
		int b=intlist.get(6);
		System.out.println(b);
		System.out.println(intlist);
		
		int value=111;
		if(intlist.contains(value)) {
			System.out.println("In list");
		}
		else {
			System.out.println("Not in list");
		}
	}
}
