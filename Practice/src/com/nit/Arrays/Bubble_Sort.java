package com.nit.Arrays;

public class Bubble_Sort {
    private static void bubble_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={65,3,8,6,9,42,9};
        System.out.print("before sorting\n ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
        bubble_sort(arr);
        System.out.print("\n After sorting\n ");
        for (int value : arr) {
            System.out.print(" " + value);
        }
    }
}
