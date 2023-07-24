package com.naprep1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q5and {
	public static void main(String[] args) {
		String s1="Tejeswar";
		
			
		Map<Character, Long> map=s1.chars().mapToObj(s-> (char)s).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println(map);
		
		for(char ch: s1.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println(ch);
			}
		}
		
	}

}
