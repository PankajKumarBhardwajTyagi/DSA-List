package last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Dilip", 30000));
		employees.add(new Employee("Ashok", 20000));
		employees.add(new Employee("Zeeshan", 50000));
		employees.add(new Employee("Kiran", 70000));
		employees.add(new Employee("Rajesh", 10000));
		employees.add(new Employee("Nithin", 2000));
		employees.forEach(System.out::println);
		System.out.println();
		
		Employee[] arrEmployees = employees.stream().toArray(Employee[]::new);
		
		Arrays.sort(arrEmployees, (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
		for(Employee employee : arrEmployees) System.out.println(employee);
		System.out.println();

		Arrays.sort(arrEmployees, (Employee o1, Employee o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1);
		for(Employee employee : arrEmployees) System.out.println(employee);
		System.out.println();
	}
}