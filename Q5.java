package com.naprep1;

public class Q5 {
	public void reverseString(String st1) {
		if ((st1==null)||(st1.length() <= 1))   
			System.out.println(st1);   
			else  
			{   
			System.out.print(st1.charAt(st1.length()-1));   
			reverseString(st1.substring(0,st1.length()-1));   
			}   
	}
public static void main(String[] args) {
	String st1="Tejeswar";
	Q5 rs=new Q5();
	rs.reverseString(st1);
	String st2="Ram";
	for(int i=st2.length()-1;i>=0;i--) {
		System.out.print(st2.charAt(i));
	}
	
}
}
