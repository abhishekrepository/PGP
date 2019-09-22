package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=11;i<=16;i++) {
			al.add(i); //auto-boxing (converts int to Integer) 
		}
		System.out.println(al);
		
		iterate1(al);
		separator();
		
		iterate2(al);
		separator();
		
		iterate3(al);
		separator();	
		iterate4(al);
		separator();

		iterate5(al);
		separator();			
	} //main
	
	static void iterate1(List<Integer> list) {
		System.out.println("1.using for loop with get() - only for java.util.List");
		for(int i=0;i<list.size();i++) {
			Integer n = list.get(i);
			System.out.print(n+"   ");
		}
	}

	static void iterate2(List<Integer> list) {
		System.out.println("2.using enhanced for loop");
		for(Integer n : list) {
			System.out.print(n+"   ");
		}
	}
	
	static void iterate3(List<Integer> list) {
		System.out.println("3.using java.util.Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");		
		}
	}

	static void iterate4(List<Integer> list) {
		System.out.println("4.using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n+"   ");		
		}
		separator();
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"   ");
		}
	}	
	
	static void iterate5(List<Integer> data) {
		System.out.println("5.using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(data);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
	}
	static void separator() {
		System.out.println();
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {}
	}
}
