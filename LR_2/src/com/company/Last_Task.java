package com.company;

public class Last_Task {

    static int X[] = new int[20];
    static int O[] = new int[20];
    static int K[] = new int[20];

    static void maxAndMin() {
        int b = 0, countt = 0;
        for (int i = 0; i < 20; i++) {

            if (X[i] != 0) {
                K[b] = X[i];
                countt++;
                b++;

            }
        }
        System.out.println();
        System.out.println(countt);
        for (b = 0; b < countt; b++) {
            System.out.println("K[" + b + "] = " + K[b]);
        }
    }

    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            X[i] = (int) (Math.random() * 20 - 10);
            System.out.println("X[" + i + "] = " + X[i]);
        }

        int j = 0;
        int count_j = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 0) {
                O[j] = X[i];
                j++;
                count_j++;
            }
        }
        System.out.println();
        for (j = 0; j < count_j; j++) {
            System.out.println("O[" + j + "] = " + O[j]);
        }

        j = 0;
        count_j = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] != 0) {
                K[j] = X[i];
                j++;
                count_j++;
            }
        }
        System.out.println();
        for (j = 0; j < count_j; j++) {
            System.out.println("K[" + j + "] = " + K[j]);
        }
    }
}