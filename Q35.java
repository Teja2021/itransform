package com.naprep1;

import java.util.Scanner;

public class Q35 {
	
	//function finds the nth Pell number  
	public static int pellNumber(int num)  
	{  
	if (num <= 2)  
	return num;  
	//a and b denote first (P1) and second (P2) term  
	int x = 1;  
	int y = 2;  
	int z;  
	for (int i = 3; i <= num; i++)   
	{  
	z = 2 * y + x;  
	x = y;  
	y = z;  
	}  
	return y;  
	}  
	//driver code  
	public static void main(String args[])  
	{  
	int num = 17;  
	System.out.println("The " +num+"-th" +" term of the series is: " +pellNumber(num));  
	}  
}
