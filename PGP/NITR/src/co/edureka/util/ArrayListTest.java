package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		
		names.add("Sunil");
		names.add("Anil");
		names.add("Pankaj");
		names.add("Nitin");
		names.add("Sunil");
		names.add("Ajay");
		
		System.out.println(names+" | Size="+names.size());
		
		//add a new name in index 1
		names.add(1,"Anirudh");
		System.out.println(names+" | Size="+names.size());
		
		//replace an element in index 2
		names.set(2,"Gopal");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println("name @ index 0 = "+ names.get(0));
		
		System.out.println("remove(object) = "+ names.remove("Sunil")); //true
		System.out.println("remove(int index) = "+ names.remove(3)); // Nitin
		
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Is Sunil in list = "+ names.contains("Sunil"));
		
	}
}
