package com.atanu;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 7, 99, 3};
       
        print(arr);
        System.out.println("******************************");
        System.out.println(maxMin(arr));
	}


	// TC : O(n)
	// SC : O(1)
	private static int maxMin(int[] arr) {
		// finding max
		int max = Integer.MIN_VALUE;
		for (int a : arr) {
			if (a > max)
				max = a;
		}
		return max;
	}

	private static void print(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
