package data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List<Student> getAllStudents(){

        Student student1 = new Student("Mehmet",2,Arrays.asList("Math", "Biology","Chemistry"));
        Student student2 = new Student("Kerem",3, Arrays.asList("Literature", "Sociology"));

        List<Student> students = Arrays.asList(student1,student2);
        return students;
    }

}
