package com.vignesh.DSA;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a =  sc.nextInt();
        System.out.println("Enter the second number: ");
        int b =  sc.nextInt();
        //System.out.println("The GCD is " + gcd(a,b));
        System.out.println("The Euclid_GCD is " + euclidGcd(a,b));
    }

    static int gcd(int a, int b){
        int min = 0;
        if(a<b){
            min = a;
        }else{
            min = b;
        }

        for(int i = min; i >= 1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
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
