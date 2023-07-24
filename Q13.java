package com.naprep1;

import java.net.MulticastSocket;
import java.util.Arrays;

public class Q13 {
	public static void main(String[] args) {
		String s1="Tejeswar";
		String s2="Tep";
		char[] s3=s1.toCharArray();
		char[] s4=s2.toCharArray();
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		if(s1==null || s2==null || s1.length() != s2.length()) {
			System.out.println("it is not a anagram ");
		}
		else {
			if(s3==s4) {
				System.out.println("it is a anagram");
			}
			else {
				System.out.println("its is not a anagram");
			}
			
		}
	}

}
