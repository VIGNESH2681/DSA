package com.vignesh.DSA;

import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("The right position is: "+ jos(n,k));
    }

    static int jos(int n, int k) {
        if(n==1){
            return 0;
        }
        return (jos(n-1,k)+k)%n;
    }
}
