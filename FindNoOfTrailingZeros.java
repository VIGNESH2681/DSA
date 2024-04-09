package com.vignesh.DSA;

import java.util.Scanner;

public class FindNoOfTrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int n =  sc.nextInt();
        System.out.println("The Trailing Zeros in the given number is "+trailingzeros(n));
    }

    static int trailingzeros(int n) {
        int res = 0;
        int powOf5 = 5;
        while(n>=powOf5){
            res = res + (n/powOf5);
            powOf5 = powOf5*5;
        }
        return res;
    }
}
