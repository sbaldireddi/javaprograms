package com.nit.Arrays;

public class AddMatrix {
    public static void main(String [] args) {

        int[][] ia1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i1 = 0; i1 < ia1.length; i1++) {
            int[] value = ia1[i1];
            for (int i2 = 0; i2 < value.length; i2++) {
                int i = value[i2];
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
        int[][] ia2={{9,8,7},{6,5,4},{3,2,1}};
        for (int[] ints : ia2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int[][] ia3=new int[3][3];
            for (int i=0;i<ia3.length;i++){
                for (int j=0;j<ia3[i].length;j++){
                   ia3[i][j]=ia1[i][j]+ia2[i][j];
                   System.out.print(ia3[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
