package com.naprep1;

public class Q2 {
	 public static int findSmallestSumOfConsecutive(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Input array is empty or null.");
	        }

	        int currentSum = arr[0];
	        int minSum = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currentSum = Math.min(arr[i], currentSum + arr[i]);
	            minSum = Math.min(minSum, currentSum);
	        }

	        return minSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, -5, 3, -1, 7, -2, 5, -3, 6};
	        int smallestSum = findSmallestSumOfConsecutive(arr);
	        System.out.println("Smallest sum of consecutive numbers: " + smallestSum);
	    }

}
