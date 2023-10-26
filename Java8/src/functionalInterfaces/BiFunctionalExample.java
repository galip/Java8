package functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class BiFunctionalExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> biFunction = ((students, studentPredicate) -> {
		
		Map<String, Integer> studentGradeMap = new HashMap<>();
		
		students.forEach(student -> {
			if(studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGrade());
			}
		});
		return studentGradeMap;
	});
	
	public static void main(String args[]) {
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateExample.p1));
	}
}