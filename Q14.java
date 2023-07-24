package com.naprep1;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st1=sc.nextLine();
		String st2=st1.toLowerCase();
		char[] ch=st2.toCharArray();
		Arrays.sort(ch);
		for(char c: ch) {
			System.out.print(c);
		}
	}

}
