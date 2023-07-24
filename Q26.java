package com.naprep1;

import java.util.Scanner;

public class Q26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		boolean isTwo=false;
		for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
            	if(i==2 && !isTwo) {
            		System.out.print(i + " ");
              
                    isTwo=true;
            	}
            	else if(i!=2) {
            		System.out.print(i + " ");
            		
            	}
            	
                
                n /= i;
            }
        }
		
	}

}
