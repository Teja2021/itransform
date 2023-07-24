package com.naprep1;

import java.util.Scanner;

public class Q30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		String st=Integer.toString(n);
		int r=st.length();
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int k=temp%10;
			double t=k;
			sum=(int) (sum+Math.pow(k, r));
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("amstrong no ");
		}
		else {
			System.out.println("not a amstrong no");
		}
	}

}
