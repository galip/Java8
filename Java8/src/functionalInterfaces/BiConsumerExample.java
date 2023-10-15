package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDatabase;

public class BiConsumerExample {
	
	public static void getNameAndFavouriteLectures() {
		
		BiConsumer<String, List<String>> biConsumer = (name, favLectures) -> System.out.println(name + " : " + favLectures);
		
		List<Student> students = StudentDatabase.getAllStudents();
		
		students.forEach((student -> biConsumer.accept(student.getName(), student.getFavouriteLectures())));
	}
	
	public static void main(String args[]) {

		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a :" + a + " b: " + b);
		};

		biConsumer.accept("Hello", "Hi");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiply result is: " + a * b);
		};

		multiply.accept(3, 5);
		
		getNameAndFavouriteLectures();
	}
}