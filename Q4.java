package com.naprep1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");;
		int n=sc.nextInt();
		System.out.println("Enter the power");
		int p=sc.nextInt();
		double sum=1;
		for(int i=1;i<=p;i++) {
			sum=n*sum;
		}
		System.out.println("the value is "+(1/sum));
	}

}
