package lambdas;

public class RunnableLambdaExample {
	
	public static void main(String args[]) {
		
		Runnable runnable = () -> {
			System.out.println("Inside runnable");
		};
		
		Runnable runnable2 = () -> System.out.println("Inside runnable2");
		
		new Thread(runnable).start();
		
		new Thread(runnable2).start();
		
		new Thread(() -> System.out.println("Inside runnable 3")).start();
		
	}
}