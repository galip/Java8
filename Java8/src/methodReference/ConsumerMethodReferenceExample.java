package methodReference;

import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> studentConsumer = System.out::println;
	
	static Consumer<Student> favLecturesConsumer = Student::printFavouriteLectures;

	public static void main(String args[]) {

		StudentDatabase.getAllStudents().forEach(studentConsumer);
		
		StudentDatabase.getAllStudents().forEach(favLecturesConsumer);

	}
}