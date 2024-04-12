package com.vignesh.DSA;

import java.util.Scanner;

public class PowerOf2 {

    static boolean powof2(int n){
        if(n==0){
            return false;
        }

        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(powof2(n));
    }
}
