package functionalprogramming;

import java.util.function.Function;

public class FunctionsDemo {
	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> s.length();

		System.out.println("Length of 'hello' = " + f1.apply("Hello"));
	}
}
