package com.naprep1;

import java.util.Scanner;

public class Q27 {
	public static boolean isPrime(int n) {
		if(n <=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System .in);
		System.out.println("enter the first no ");
		int s1= sc.nextInt();
		System.out.println("Enter the second no ");
		int s2=sc.nextInt();
		for(int i=s1;i<s2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
