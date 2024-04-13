package com.vignesh.DSA;

public class Print_N_Natural_Num {

    static void printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printN(5);
    }
}
