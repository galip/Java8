package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerExample {
	
	static Consumer<Student> consumer1 = (student) -> System.out.println(student);
	static Consumer<Student> consumer2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> consumer3 = (student) -> System.out.println(student.getFavouriteLectures());
	
	public static void getStudents() {
		
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(consumer1);
	}
	
	public static void getNameAndFavouriteLectures() {
		
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(consumer2.andThen(consumer3));
	}
	
	public static void getNameAndFavouriteLecturesByGrade() {
		
		List<Student> students = StudentDatabase.getAllStudents();
		
		students.forEach(student -> {
			if(student.getGrade() > 2) {
				consumer2.andThen(consumer3).accept(student);
			}
		});
	}
	
	public static void main(String args[]) {
	
		Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase());
		
		consumer.accept("TEST");
		
		getStudents();
		getNameAndFavouriteLectures();
		getNameAndFavouriteLecturesByGrade();
	}
}
