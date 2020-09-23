package com.mahendra.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.mahendra.data.Data;
import com.mahendra.data.Employee;

public class FunctionExampleThree {
	public static void main(String[] args) {
		List<Employee> employeeList = Data.getEmployeeList();

		System.out.println(employeeList);
		Function<List<Employee>, Double> salariesFunction = eList -> {
			double total = 0;
			for (Employee e : eList) {
				total = total + e.getSalary();
			}

			return total;
		};

		System.out.println("The total salaries of employees for this month:" + salariesFunction.apply(employeeList));

		System.out.println("***************************");
		Predicate<Employee> p = e -> e.getSalary() < 3500;
		Function<Employee, Employee> f = e -> {
			e.setSalary(e.getSalary() + ((3 * e.getSalary() / 100)));
			return e;
		};

		List<Employee> l2 = new ArrayList<Employee>();
		for (Employee e : employeeList) {
			if (p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		System.out.println("Employees with incremented salary:");
		System.out.println(l2);

	}
}
