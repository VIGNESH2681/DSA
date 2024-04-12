package com.vignesh.DSA;

import java.util.Scanner;

public class Consecutive1 {
    static boolean isconsecutive(int n){
        if((n & (n<<1)) != 0){
            return true;
        }
        else {
            return false;
        }
    }

    static int countconsecutive(int n) {
        int count = 0;

        while(n>0){
            n = n & (n<<1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether binary number has consecutive 1's : ");
        int n = sc.nextInt();
        System.out.println(isconsecutive(n));
        System.out.print("The number of consecutive 1's: ");
        System.out.println(countconsecutive(n));
    }


}
