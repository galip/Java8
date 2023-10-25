package functionalInterfaces;

import java.util.function.Function;

public class FunctionalExample {
	
	static Function<String, String> function = (name) -> name.toUpperCase();
	
	static Function<String, String> concatString = (name) -> name.toLowerCase().concat("concatanation");
	
	public static void main(String args[]) {
		
		System.out.println(function.apply("java8"));
		
		System.out.println(function.andThen(concatString).apply("java8"));
		
		System.out.println(function.compose(concatString).apply("java8"));
	}
}