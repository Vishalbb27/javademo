package functionalprogramming;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> gt20 = (i) -> (i > 20);
		System.out.println("Is 15 > 20: " + gt20.test(15));
		Predicate<String> str = (s) -> (s.length() > 5);
		System.out.println(str.test("How are you"));

		Predicate<Integer> gt10 = (i) -> (i > 10);
		int[] x = { 0, 10, 20, 30, 40 };
		m1(gt10, x);

		Predicate<Integer> even = (i) -> (i % 2 == 0);
		int[] y = { 1, 2, 3, 4, 5, 7, 6, 8, 9, 10, 33, 45, 90, 32 };

		m1(gt10.and(even), y);

	}

	static void m1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}

	// Write a predicate to test even number
	// Pass the predicate to an array and print only even numbers

}
