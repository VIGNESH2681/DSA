package com.vignesh.DSA;

public class SumOfElementUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumOfElement(arr,0));
    }

    static  int sumOfElement(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }
        return sumOfElement(arr,i+1) + arr[i];
    }
}
