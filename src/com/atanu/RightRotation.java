package com.atanu;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99};
        int [] arr1 = new int [] {12, 3, 6, 99};
        int [] arr2 = new int [] {12, 3, 6, 99, 51};
        int [] arr3 = new int [] {12, 3, 6, 99};

        print(arr);
		rightBy1(arr);
		print(arr);

		print(arr1);
		rightByD1(arr1, 2);
		print(arr1);

		print(arr2);
		rightByD2(arr2, 2);
		print(arr2);

		print(arr3);
		rightByD3(arr3, 1);
		print(arr3);
	}


	// TC : O(n)
	// SC : O(1)
	private static void rightBy1(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}

	// TC : O(n*d)
	// SC : O(1)
	private static void rightByD1(int[] arr, int d) {
		if (d == arr.length)
			return;
		for (int i = 0; i < d; i++) {
			rightBy1(arr);
		}
	}

	// TC : O(n)
	// SC : O(d)
	private static void rightByD2(int[] arr, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length-d+i];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i+d] = arr[i];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
	}

	// TC : O(n)
	// SC : O(1)
	private static void rightByD3(int[] arr, int d) {
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
