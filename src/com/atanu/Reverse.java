package com.atanu;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99, 45};
       
        print(arr);
		reverse1(arr);
		reverse3(arr, 0, arr.length-1);
		print(arr);
	}


	// TC : O(n)
	// SC : O(n)
	private static void reverse1(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			res[arr.length-i-1] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

	// TC : O(n/2)
	// SC : O(1)
	private static void reverse2(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}

	// TC : O(n/2)
	// SC : O(n/2)
	private static void reverse3(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		reverse3(arr, start+1, end-1);
	}


	private static void print(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
