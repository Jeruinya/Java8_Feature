package java8.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStream {

	public static void main(String args[]) {
		List<Integer> l = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		l.add(100);
		l.add(21);
		l.add(30);
		l.add(34);
		l.add(11);
		l.add(48);
		l.add(22);
		for (Integer i : l) {
			if (i % 2 == 0) {

				l1.add(i);
			}
		}
		System.out.println(l);
		System.out.println(l1);

		List<Integer> l2 = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);

		Integer I = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Value:" + I);
		Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum Value from the List:" + max);

		l.stream().forEach(i -> System.out.println(i));
		l.stream().forEach(System.out::println);
		System.out.println("Array Elements Afeter converting to array");

		Integer[] i = l.stream().toArray(Integer[]::new);
		for (Integer integer : i) {
			System.out.println(integer);

		}

	}

}
