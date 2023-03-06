package garbagecollectiondemo;

import threadingdemo.Utils;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
//		Thread mainThread=Thread.currentThread();
//		mainThread.setDaemon(true);
		for (int i = 0; i <= 100000; i++) {
			new House(i);
		}
		// We can request garbage collector to run explicitly
		System.gc();
	}
}

class House {
	int id;

	House(int id) {
		this.id = id;
		Utils.printmessage("House Created - " + id);
	}

	protected void finalize() throws Throwable {
		Utils.printmessage("House Destroyed");
	}
}