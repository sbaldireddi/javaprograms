package com.nit.Arrays;

public class Selection_Sort {
    private static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {3,8, 6, 87, 2, 9, 7};
        System.out.print("before sorting\n");
        for (int value : arr) {
            System.out.print(" " + value);
        }
        selection_sort(arr);
        System.out.println("\nAfter sorting");
        for (int value : arr) {
            System.out.print(" " + value);
        }
    }
}

