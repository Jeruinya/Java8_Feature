package java8.predicate;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ram", "Manager", 450000, "Pune");
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		System.out.println(list);

	}

}
