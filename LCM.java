package com.vignesh.DSA;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a =  sc.nextInt();
        System.out.println("Enter the second number: ");
        int b =  sc.nextInt();
        //System.out.println("The GCD is " + gcd(a,b));
        System.out.println("The LCM is " + findLcm(a,b));
    }

    static int findLcm(int a, int b) {
        return (a*b)/euclidGcd(a,b);
    }


    //time complexity O(log(min(a,b))
    static int euclidGcd(int a, int b){
        while(a != 0 && b != 0){
            if(a>b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        if(a != 0){
            return a;
        }else{
            return b;
        }

    }
}
