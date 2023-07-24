package com.naprep1;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="28156437";
		int[] arr=new int[st.length()];
		int a=Integer.parseInt(st);
		int temp=a;
		int i=0;
		System.out.println(a);
		while(temp !=0) {
			int j=temp%10;
			
			arr[i]=j;
			
			temp=temp/10;
			i++;
		}
		int t1=0;
		  for(int k=0; k < arr.length; k++){  
              for(int j=1; j < (arr.length-k); j++){  
                       if(arr[j-1] > arr[j]){  
                              
                              t1 = arr[j-1];  
                              arr[j-1] = arr[j];  
                              arr[j] = t1;  
                      }  
                       
              }  
      }  
		
		for(int k: arr) {
			System.out.print(k);
		}
		
		
		
	}

}
