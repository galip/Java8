package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDatabase;

public class SupplierExample {

	public static void main(String args[]) {
		
		Supplier<Student> studentSupplier = () -> {
			return new Student("Mike", 3, Arrays.asList("Math", "Biology"));
		};
		
		Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();
		
		System.out.println(studentSupplier.get());
		
		System.out.println(listSupplier.get());
	}
}