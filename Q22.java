package com.naprep1;

public class Q22 {
	public static void main(String[] args) {
        int[] arr = {12, 43, 54, 65, 22, 43, 45, 12, 45};
        int Largest = Integer.MIN_VALUE;
        int Sec_Largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > Largest) {
                Sec_Largest = Largest;
                Largest = i; 
            } else if (i > Sec_Largest && i != Largest) {
                Sec_Largest = i;
            }
        }

        System.out.println(Sec_Largest);
    }
}
