package com.nit.Arrays;

public class SecondLargeast {
    public static void main(String[] args) {
        int[] arr = {21, 5, 98, 64, 7};
        int num = arr.length;
        int temp;
        int i;
        for( i=0;i<num;i++) {
            for (int j = 1; j < (num - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
                System.out.println(arr[i-2]);


    }
}


