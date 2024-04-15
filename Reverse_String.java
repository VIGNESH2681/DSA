package com.vignesh.DSA;

import java.util.Scanner;

public class Reverse_String {

    static String reverseString(String s, String r, int i){
        if(i<0){
            return r;
        }
        return reverseString(s,r+s.charAt(i),i-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println("The Reversed String is: "+reverseString(s,"",s.length()-1));

    }
}
