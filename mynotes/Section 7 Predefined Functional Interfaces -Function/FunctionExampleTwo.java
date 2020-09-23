package com.mahendra.section7;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.mahendra.data.Data;
import com.mahendra.data.Student;

public class FunctionExampleTwo {
	public static void main(String[] args) {
		Predicate<Student> gradeA = s -> s.getScore() >= 80;
		Predicate<Student> gradeB = s -> s.getScore() >= 60 && s.getScore() < 80;
		Predicate<Student> gradeC = s -> s.getScore() >= 50 && s.getScore() < 60;
		Predicate<Student> gradeD = s -> s.getScore() >= 35 && s.getScore() < 50;
		Function<Student, String> f = s -> {
			if (gradeA.test(s)) {
				return "A Grade";
			} else if (gradeB.test(s)) {
				return "B Grade";
			} else if (gradeC.test(s)) {
				return "C Grade";
			} else if (gradeD.test(s)) {
				return "D Grade";
			} else {
				return "E Grade";
			}
		};

		List<Student> studentList = Data.getStudentList();
		for (Student s : studentList) {
			System.out.println("Student Name:" + s.getName());
			System.out.println("Student Score:" + s.getScore());
			System.out.println("Student Grade:" + f.apply(s));
			System.out.println();
		}
	}
}
