package walter.test.java8;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testHash {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();
		set.add(new Student("Walter", "S01"));
		set.add(new Student("Peter", "S02"));
		set.add(new Student("Walter", "S01"));
		
		System.out.println(set);
		
		
		
		
		
		
	}
	
}
