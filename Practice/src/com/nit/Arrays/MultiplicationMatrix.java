package com.nit.Arrays;

import java.awt.*;

public class MultiplicationMatrix {
    public static void main(String[] agrs){
        int [][] ia1={{-1,4},{2,3}};
        for(int i=0;i<ia1.length;i++){
            for (int j=0;j<ia1[i].length;j++){
                System.out.print(ia1[i][j]+" ");
            }
         System.out.println("\n");
        }
        int[][] ia2={{9,-3},{6,1}};
        for(int i=0;i<ia2.length;i++){
            for(int j=0;j<ia2[i].length;j++){
                System.out.print(ia2[i][j]+" ");
            }
            System.out.println("\n");
        }
        int[][] ia3=new int[2][2];
        for (int i=0;i<ia3.length;i++){
            for (int j=0;j<ia3[i].length;j++) {
                ia3[i][j] = ia1[i][j] * ia2[j][i];

                System.out.print(ia3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
