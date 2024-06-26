package com.vignesh.DSA;

import java.util.Scanner;

public class PrimeFactors {

    static void primeFactors(int n){
        if(n==1){
            System.out.println("1 is neither prime nor composite.");

        }
        int i = 2;
        while(i*i <= n){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
        if(n > 1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
    }
}
