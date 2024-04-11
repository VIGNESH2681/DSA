package com.vignesh.DSA;

import java.util.Scanner;

public class Bitwise {
    static int posOfRMSB(int rmsb){
        return (int)(Math.log10(rmsb^(rmsb & (rmsb-1))) / Math.log10(2)) + 1;
    }
    public static void main(String[] args) {

        System.out.println(5|9);
        System.out.println(5&9);
        System.out.println(5^9);
        System.out.println(5<<2);
        System.out.println(5>>1);
        System.out.println(5>>2);
        System.out.println(-5>>1);
        System.out.println(-5>>>1);

        int n = 36;
        int i =5;

        int onMask = 1<<i;
        System.out.println(n|onMask);

        int offMask = ~(1<<i);
        System.out.println(n & offMask);

        int tMask = 1 << i;
        System.out.println(n ^ tMask);

        int cMask = 1<<i;
        if((n & cMask) == 0){
            System.out.println("OFF");
        }else{
            System.out.println("ON");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int rmsb = sc.nextInt();
        System.out.println(posOfRMSB(rmsb));


    }
}
