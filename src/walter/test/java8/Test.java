package walter.test.java8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	
	static String[] names = {"Justin", "Monica", "Irene"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Lambda*/
		
		/*Parallel Stream*/
		List<Integer> numbers = Arrays.asList(5,15,45,321,4,8,7,31,2,1);
		
		List<Integer> biggerThan40 = numbers.parallelStream()
										.filter(number -> number > 40)
										.collect(toList())
										;
		List<Integer> alsoAdded = biggerThan40.parallelStream()
								.map(number -> number + 10)
								.collect(toList())
								;

		/*
		Collections.sort(numbers);
		Collections.sort(biggerThan40);
		Collections.sort(alsoLt);
		*/
		System.out.println("Print Number > 40");
		evaluate(biggerThan40, (n)-> true);
	
	
		System.out.println("Print Number > 40 and added 10");
		evaluate(alsoAdded, (n)-> true);
		

		System.out.println("Print even number");
		evaluate(numbers, (n)-> n%2 == 0);
		

		System.out.println("Print odd number");
		evaluate(numbers, (n)-> n%2 != 0);
		
		System.out.println("Print Number > 40");
		evaluate(numbers, (n)-> n > 40);
		
	}
	
	
	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {

			if (predicate.test(n)) {

				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

}
