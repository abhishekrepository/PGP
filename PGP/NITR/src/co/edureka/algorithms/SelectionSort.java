package co.edureka.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {64,25,12,22,1,11};
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr)
	{
	 for(int i=0;i<arr.length-1;i++) {
		 int min = i;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[j]<arr[min])
				 min=j;
		 }
		 if(min != i) {
			 int temp = arr[min];
			 arr[min] = arr[i];
			 arr[i] = temp;
		 }
	 }
	}

}
