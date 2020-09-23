package com.mahendra.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Sunny", 100));
		studentList.add(new Student("Bunny", 65));
		studentList.add(new Student("Chinny", 55));
		studentList.add(new Student("Vinny", 45));
		studentList.add(new Student("Pinny", 25));
		return studentList;
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Mark", 1000));
		employeeList.add(new Employee("Joan", 2000));
		employeeList.add(new Employee("David", 3000));
		employeeList.add(new Employee("Pet", 4000));
		employeeList.add(new Employee("Jack", 5000));
		return employeeList;
	}

}
