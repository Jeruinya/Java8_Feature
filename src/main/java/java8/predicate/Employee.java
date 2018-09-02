package java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

	private String name;
	private String designation;
	private double salary;
	private String city;

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {

		String str = String.format("(%s ,%s , % .2f, %s)", name, designation, salary, city);
		return str;

	}

	public boolean equals(Object obj) {

		Employee e = (Employee) obj;
		if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city.equals(e.city)) {
			return true;
		}

		else
			return false;

	}

	public static void main(String args[]) {

		List<Employee> eList = new ArrayList<Employee>();
		populate(eList);

		System.out.println("Information of employees who are Managers");
		Predicate<Employee> p = emp -> emp.designation.equals("Manager");
		display(p, eList);

		Predicate<Employee> p1 = emp -> emp.city.equals("Pune");
		System.out.println("Information of Employees who are from Delhi :");
		display(p1, eList);

		System.out.println("All employees whose salary less than 20000 :");
		Predicate<Employee> p2 = emp -> emp.salary < 20000;
		display(p2, eList);
		// Joined predicate
		System.out.println("All Banglore Manager'give pink slip to g:");
		display(p.and(p1), eList);

		System.out.println("All Employees who are manager's or salary is less that 20000");

		display(p.or(p2), eList);

		System.out.println("Select all employee's who are not managers: ");
		display(p.negate(), eList);

		System.out.println("isEqual static  method ");

		Predicate<String> pre = Predicate.isEqual("Allstate Technologies");
		System.out.println(pre.test("Allstate Technologies"));
		System.out.println(pre.test("HCL Technologies"));

		Employee e1 = new Employee("Anshuma", "CEO", 350000, "Hyderabad");
		Predicate<Employee> pre1 = Predicate.isEqual(new Employee("Anshuma", "CEO", 350000, "Hyderabad"));
		System.out.println(pre1.test(e1));

	}

	public static List<Employee> populate(List<Employee> list) {

		list.add(new Employee("Ram", "Manager", 20000.9, "Pune"));
		list.add(new Employee("Mohan", "CEO", 30000.9, "HYD"));
		list.add(new Employee("Raju", "CFO", 40000.9, "Delhi"));
		list.add(new Employee("Ramesh", "Consultant", 60000.9, "GKP"));
		list.add(new Employee("Kamlesh", "Senior Consultant", 650000.9, "Delhi"));
		list.add(new Employee("Yadu", "Senior Consultant", 18000, "Delhi"));

		return list;

	}

	public static void display(Predicate<Employee> p, List<Employee> list) {

		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("*****************************************");
	}

}
