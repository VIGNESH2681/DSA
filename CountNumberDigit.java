package com.vignesh.DSA;

import java.util.Scanner;

public class CountNumberDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countDigits(n));

    }

    static int countDigits(int n){
       int count = 0;
        while(n > 0){
          n = n/10;
          count++;
        }
        return count;
    }
}
