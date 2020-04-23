package com.nit.Arrays;

public class Sum_of_Array {
    public static void main(String[] args) {
        int[] arr={53,56,68,64,65};
        int sum=arr[0];

        for (int value : arr) {
            sum = sum + value;
        }
        System.out.println("sum of array = "+sum);
    }
}
