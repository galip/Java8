package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String args[]) {
	
		Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase());
		
		consumer.accept("TEST");
	
	}
}