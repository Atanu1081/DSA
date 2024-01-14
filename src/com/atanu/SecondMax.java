package com.atanu;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 7, 99, 3, 53, 6};
       
        print(arr);
        System.out.println("******************************");
        System.out.println(secondMax(arr));
	}


	// TC : O(n)
	// SC : O(1)
	private static int secondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	private static void print(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
