package com.naprep1;

import java.util.Scanner;

public class Q16 {
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
			sum=sum+j;
		}
		System.out.println(sum);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
