package com.atanu;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99};
        int [] arr1 = new int [] {12, 3, 6, 99};
        int [] arr2 = new int [] {12, 3, 6, 99};
        int [] arr3 = new int [] {12, 3, 6, 99};

        print(arr);
		leftBy1(arr);
		print(arr);

		print(arr1);
		leftByD1(arr1, 2);
		print(arr1);

		print(arr2);
		leftByD2(arr2, 2);
		print(arr2);

		print(arr3);
		leftByD3(arr3, 2);
		print(arr3);
	}


	// TC : O(n)
	// SC : O(1)
	private static void leftBy1(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}

	// TC : O(n*d)
	// SC : O(1)
	private static void leftByD1(int[] arr, int d) {
		if (d == arr.length)
			return;
		for (int i = 0; i < d; i++) {
			leftBy1(arr);
		}
	}

	// TC : O(n)
	// SC : O(d)
	private static void leftByD2(int[] arr, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		for (int i = d; i < arr.length; i++) {
			arr[i-d] = arr[i];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[arr.length-d+i] = temp[i];
		}
	}

	// TC : O(n)
	// SC : O(1)
	private static void leftByD3(int[] arr, int d) {
		int n = arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
	}

	private static void reverse(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		reverse(arr, start+1, end-1);
	}


	private static void print(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
