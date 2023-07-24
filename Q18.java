package com.naprep1;

import java.util.Scanner;

public class Q18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string ");
	String s1=sc.nextLine();
	int count=0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a' || s1.charAt(i)=='A') {
			count++;
		}
	}
	System.out.println(count);
}
}
