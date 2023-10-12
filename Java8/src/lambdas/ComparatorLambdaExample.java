package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String args[]) {
		
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println(comparatorLambda.compare(5, 3));
		
		Comparator<Integer> comparatorLambda2 = (a,b) -> a.compareTo(b);
		System.out.println(comparatorLambda2.compare(5, 3));
		
	}
}