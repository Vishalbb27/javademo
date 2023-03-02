package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		queue.offer("Hi");
		queue.offer("How");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove(3));
		System.out.println(queue);
	}
}
