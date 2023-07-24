package com.naprep1;

import java.util.Map;
import java.util.stream.Collectors;

public class Q6 {
	public static void main(String[] args) {
		String s1="Tejeswar";
		
		
		Map<Character, Long> map=s1.chars().mapToObj(s-> (char)s).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println(map);
		
		for(char ch: s1.toCharArray()) {
			if(map.get(ch)>1) {
				System.out.println(ch);
			}
		}
		
	}
	}


