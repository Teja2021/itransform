package com.naprep1;

public class Q24 {
	public static void main(String[] args) {
		int[] arr= {12,32,3,54,67,78,23,57,90,93,96};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is prime ");
			}
			else {
				System.out.println(arr[i]+" is not prome");
			}
		}
		
		
	}

}
