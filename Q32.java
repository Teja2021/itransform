package com.naprep1;

import java.util.Scanner;

public class Q32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=sc.nextInt();
		int temp=a;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
			
		}
		System.out.println(count);
	}

}
