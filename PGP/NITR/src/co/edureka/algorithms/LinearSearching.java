package co.edureka.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		int[] n = new int[] {85,74,2,56,49,50,12,73};
		System.out.println("Array Contents = "+ Arrays.toString(n));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter element search: ");
		int key = sc.nextInt();
		
		int index = searchElement(n, key); 
		if(index == -1)
			System.out.println(key+" is NOT available in list");
		else
			System.out.println(key+" @ "+index);
		
		sc.close();
	}
	static int searchElement(int[] n, int key) {
		for(int i=0;i<n.length;i++) {
			if(key == n[i])
				return i;
		}
		return -1;
	}

}
