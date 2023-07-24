package com.naprep1;

import java.net.MulticastSocket;

public class Q23 {
	
	public static void main(String[] args) {
		int[] arr= {12,43,67,2,3,17,89,76,55};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
		}
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
