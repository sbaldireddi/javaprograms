package com.nit.Arrays;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] arr={56,2,9,76,2,5,4};
        System.out.println("Array before reverse ");
        for (int value : arr) {

            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Array after reverse ");
        for (int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }
}
