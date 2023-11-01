package methodReference;

import java.util.function.Function;

public class MethodRefenceExample {

	static Function<String, String> toUpperLambda = (s) -> s.toUpperCase();
	
	static Function<String, String> toUpperMethodRefrence = String::toUpperCase;
	
	public static void main(String args[]) {
		
		System.out.println(toUpperLambda.apply("java8"));
		
		System.out.println(toUpperMethodRefrence.apply("java8"));
		
	}
}