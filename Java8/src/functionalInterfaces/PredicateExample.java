package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateExample {

	static Predicate<Student> p1 = (s) -> s.getGrade() >= 3;

	public static void filterStudentsByGrade() {

		List<Student> students = StudentDatabase.getAllStudents();

		students.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void main(String args[]) {

		Predicate<Integer> p = (i) -> {
			return i % 2 == 0;
		};

		System.out.println(p.test(4));
		
		filterStudentsByGrade();

	}
}