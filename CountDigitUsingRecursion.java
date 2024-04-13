package com.vignesh.DSA;

import java.util.Scanner;

public class CountDigitUsingRecursion {

    static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return countDigits(n/10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}
