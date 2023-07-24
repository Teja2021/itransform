package com.naprep1;

import java.util.Set;

public class Q11 {
	public static void main(String[] args) {
		String s1="Tejeswar";
		String s2="Teja";
		StringBuilder s3=new StringBuilder();
		for(char ch: s1.toCharArray()) {
			if(s2.indexOf(ch)==-1) {
				s3.append(ch);
			}
		}
		System.out.println(s3);
	}

}
