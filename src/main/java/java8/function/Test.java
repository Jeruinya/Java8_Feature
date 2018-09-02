package java8.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply("Kamlesh Tripathi"));// 16
		System.out.println(f.apply("Allstate Pvt. Ltd."));// 18

		// Funtion to find square of a given number
		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(20));

	}

}
