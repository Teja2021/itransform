package com.naprep1;

import java.util.Arrays;
import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size if a array ");
		int n=sc.nextInt();
		
		System.out.println("Enet the elements ");
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			int j=sc.nextInt();
			arr[i]=j;
		}
		Arrays.sort(arr);
		System.out.println("Smallest value "+arr[0]);
		System.out.println("Largest value "+arr[arr.length-1]);
	}

}
