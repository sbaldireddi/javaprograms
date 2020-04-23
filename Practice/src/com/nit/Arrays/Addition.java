package com.nit.Arrays;

public class Addition {
    private static String[] args;

    static void add(int... a) {
        if (a.length == 0) {
            System.out.println("values are not passed");
        } else {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println("Results: " + sum);
        }
    }

    public static void main(String[] args) {
        Addition.args = args;
        add();
        add(5);
        add(5,6);
        add(5,6,7);
        add(5,6,7,8);
        add(new int[]{5,6,7,8,9});
    }
}
