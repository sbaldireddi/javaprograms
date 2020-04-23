package com.nit.Arrays;

public class Two_Dimensions {
   private static int[][]  arr={{2,5,6},{6,3,7},{8,9,4}};

    public static void main(String[] args) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }

    }
}
