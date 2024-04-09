package com.vignesh.DSA;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the number is : " + fact(n));
    }

    static int fact(int n){
        int result = 1;
        for(int i = 1 ; i <= n ; i++){
            result *= i;
        }
        return result;
    }
}
