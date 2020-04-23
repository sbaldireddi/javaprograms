package com.nit.Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {9, 3, 0, 65, 10, 1};
        int smallest =arr[0];
        int i;
        for ( i = 0; i < arr.length;i++) {
            if (arr[i] < smallest) {
                 smallest=arr[i];
            }
        }
                System.out.println(smallest);
        }
}
