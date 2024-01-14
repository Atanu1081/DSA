package com.atanu;

public class CheckSorted {

	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {12, 3, 6, 99, 45, 53, 7, 99, 3, 53, 6};
        //int [] arr = new int [] {1, 2, 3, 4, 5};

        System.out.println(isSorted1(arr));
        System.out.println(isSorted2(arr));
	}


	// TC : O(n2)
	// SC : O(1)
	private static boolean isSorted1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[i])
					return false;
			}
		}
		return true;
	}

	// TC : O(n)
	// SC : O(1)
	private static boolean isSorted2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i-1])
				return false;
		}
		return true;
	}

}
