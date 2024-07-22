package streamsApi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsExample {

	//
	public static void main(String args[]) {

		Predicate<Student> studentGpaPredicate = (student -> student.getGrade() >= 3);

		Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
				.peek((student -> {
					System.out.println(student);
				}))
				.filter(studentGpaPredicate)
				.peek((student -> {
					System.out.println("Filtered: " + student);
				}))
				.collect(Collectors.toMap(Student::getName, Student::getFavouriteLectures));

		System.out.println(studentMap);
	}
}