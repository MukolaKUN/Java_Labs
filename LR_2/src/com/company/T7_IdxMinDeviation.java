package com.company;

public class T7_IdxMinDeviation {
    static int arr[][] = new int [5][5];

    static void deviation() {
        int max = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        int vid = max ;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (max - arr[i][j] < vid && max - arr[i][j] != 0)
                    vid = max - arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Max = " + max);
        System.out.println("Deviation = " + vid);
    }

    public static void  main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }

        deviation();
    }
}
