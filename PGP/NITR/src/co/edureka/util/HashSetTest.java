package co.edureka.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("sunil");
		names.add("Praveen");
		names.add("Anil");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);
		
		names.add(null);
		System.out.println(names);
	}

}
