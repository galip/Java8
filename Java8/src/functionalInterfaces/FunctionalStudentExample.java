package functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.StudentDatabase;

public class FunctionalStudentExample {

	static Function<List<Student>, Map<String, Integer>> studentFunction = (students -> {
		Map<String, Integer> studentGradeMap = new HashMap<>();

		students.forEach((student -> {
			studentGradeMap.put(student.getName(), student.getGrade());
		}));

		return studentGradeMap;
	});

	public static void main(String args[]) {

		System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
	}

}