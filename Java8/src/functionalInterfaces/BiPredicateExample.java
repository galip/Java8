package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class BiPredicateExample {

	Predicate<Student> p1 = (s) -> s.getGrade() >= 3;
	Predicate<Student> p2 = (s) -> s.getFavouriteLectures().contains("Sociology");
	
	BiPredicate<Integer, List<String>> biPredicate = (grade, favouriteLectures) -> grade >=3 && favouriteLectures.contains("Sociology");

	BiConsumer<String, List<String>> studentBiConsumer = (name, favouriteLectures) -> System.out
			.println(name + " : " + favouriteLectures);

	Consumer<Student> studentConsumer = (student -> {
		if (biPredicate.test(student.getGrade(), student.getFavouriteLectures()	)) {
			studentBiConsumer.accept(student.getName(), student.getFavouriteLectures());
		}
	});

	public void getNameAndFavLectures(List<Student> students) {

		students.forEach(studentConsumer);
	}

	public static void main(String args[]) {

		List<Student> students = StudentDatabase.getAllStudents();

		new BiPredicateExample().getNameAndFavLectures(students);

	}
}
