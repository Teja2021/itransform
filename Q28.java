package com.naprep1;

import java.util.Scanner;

public class Q28 {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int r=temp%10;
			 sum=sum+factorial(r);
			 temp=temp/10;
			
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("is strong no ");
		}
		else {
			System.out.println("not strong no");
		}
	}

}
