package com.naprep1;

public class Q34 {
	public static void main(String[] args) {
		int[] arr= {3,6,8,9,87,5,66,87};
		int coun1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				coun1++;
			}
			else {
				count2++;
			}
			
		}
		System.out.println("no of evin no are "+coun1);
		System.out.println("no of odd no are "+count2);
	}

}
