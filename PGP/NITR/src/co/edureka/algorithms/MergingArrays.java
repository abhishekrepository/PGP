package co.edureka.algorithms;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		int[] arr1 = new int[]{2,8,9,15,20};
		int[] arr2 = {60,1,70,10,12,17,25,30,3};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = mergeArrays(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}
	
	static int[] mergeArrays(int[] arr1, int[] arr2) {
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int[] arr3 = new int[arr1_length+arr2_length];
		
		int i=0,j=0,k=0;
		while(i<arr1_length && j<arr2_length) 
		{
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i=i+1;
				k=k+1;
			}
			else {
				arr3[k++]=arr2[j++];
			}
		}
		
		//store the remaining elements of arr1 to arr3
		for(;i<arr1_length;i++) {
			arr3[k++]=arr1[i];
		}
		//store the remaining elements of arr2 to arr3
		for(;j<arr2_length;j++) {
			arr3[k++]=arr2[j];
		}	
		return arr3;
	}
}	
