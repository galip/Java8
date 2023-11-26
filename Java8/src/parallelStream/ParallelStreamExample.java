package parallelStream;

import java.util.List;

import data.Student;
import data.StudentDatabase;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample {
	
	public static List<String> sequentialStream() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getFavouriteLectures)
                .flatMap(List::stream)
                .collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Total time in sequential stream: " + (endTime - startTime));
		
		return studentActivities;
	}
	
	public static List<String> parallelStream() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDatabase.getAllStudents()
                .parallelStream()
                .map(Student::getFavouriteLectures)
                .flatMap(List::stream)
                .collect(toList());
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time in parallel stream: " + (endTime - startTime));
		
		return studentActivities;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
		
		System.out.println(sequentialStream());
		
		System.out.println(parallelStream());
	}
	
	// Output:
	/**
	Available processors: 4
	Total time in sequential stream: 121
	[Math, Biology, Chemistry, Literature, Sociology]
	Total time in parallel stream: 28
	[Math, Biology, Chemistry, Literature, Sociology]
	
	**/

}
