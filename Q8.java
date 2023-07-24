package com.naprep1;

import java.util.HashSet;
import java.util.Set;

public class Q8 {
	public static void main(String[] args) {
		String str="Tejeswar";
		str.toLowerCase();
		Set<Character> mySet1=new HashSet<>();
		Set<Character> mySet2=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'a' ||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u') {
				mySet1.add(str.charAt(i));
			}
			else {
				mySet2.add(str.charAt(i));
			}
		}
		System.out.println("vowel= "+mySet1.size());
		System.out.println("consonet= "+mySet2.size());
	}

}
