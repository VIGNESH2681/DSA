package com.vignesh.DSA;

import java.util.Scanner;

public class Palindrome_Or_Not {

    static boolean isPalindrome(String s,int i, int j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        if(j<=i){
            return true;
        }
        return isPalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println(isPalindrome(s,0,s.length()-1));

    }
}
