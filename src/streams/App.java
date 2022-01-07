package streams;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee("Jack", 26, 70000, "March 7, 1995");
		Employee e2 = new Employee("Jill", 22, 50000, "January 12, 1999");
		Employee e3 = new Employee("Steve", 43, 95000, "July 15, 1978");
		Employee e4 = new Employee("Bob", 59, 125000, "December 24, 1962");
		Employee e5 = new Employee("Lydia", 52, 111000, "August 17, 1969");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.out.println("Age greater than 30");
		employees.stream().filter((e) -> e.getAge() > 30)
				.forEach((e) -> e.print());
		
		System.out.println();
		System.out.println("Age between 50 and 60");
		employees.stream().filter((e) -> e.getAge() >= 50 && e.getAge() <= 60)
				.forEach((e) -> e.print());
		
		System.out.println();
		System.out.println("Salary greater than 100000");
		employees.stream().filter((e) -> e.getSalary() >= 100000)
				.forEach((e) -> e.print());

	}
}
