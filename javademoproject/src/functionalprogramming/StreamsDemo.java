package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ll.add(i);
		}

		System.out.println(ll);
		List<Integer> list = ll.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list);

		List<Integer> multiplyby2 = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.print(multiplyby2);

		List<String> names = new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JOHN");
		names.add("COLLINS");

		List<String> lowercasestring = names.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowercasestring);
		
		Random random=new Random();
		List<Integer> numlist=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numlist.add(random.nextInt(1,10));
		}

	}

}
