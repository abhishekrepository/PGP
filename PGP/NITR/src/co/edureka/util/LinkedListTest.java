package co.edureka.util;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sunil");
		ll.add("Anil");
		ll.add("Pankaj");
		ll.addFirst("Nitin");
		ll.addLast("Sanjay");
		System.out.println(ll);
	}

}
