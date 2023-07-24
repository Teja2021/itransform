package com.naprep1;

public class Q25 {
	public static void main(String[] args) {
		int[] arr1= {12,4,45,23,46,87,98,45};
		int[] arr2= {1,6,89,3,60,12,59,23,77};
		int i=0;
		int[] arr3=new int[arr1.length+arr2.length];
		for(int j: arr1) {
			arr3[i]=j;
			i++;
		}
		for(int j: arr2) {
			arr3[i]=j;
			i++;
		}
		for(int j: arr3) {
			System.out.print(j+" ");
		}
		
		
		
	}

}
