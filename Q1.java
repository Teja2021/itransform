package com.naprep1;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string ");
		String s1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String s2=sc.nextLine();
		StringBuilder s3=new StringBuilder();
		s3.append(s1);
		s3.reverse();
		String s4=s3.toString();
		System.out.println(s4);
		if(s2.equals(s4)) {
			System.out.println("reverse of each other");
		}
		else {
			System.out.println("not reverse");
		}
	}

}
