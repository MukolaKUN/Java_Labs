package com.company;

public class Task_54 {
    public static void main(String[] args) {
        int[] a1 = {1, 23, 34, 56, 12, 564, 6, 0, -1};

        for(int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + ", ");
        }

        System.out.print("\n");

        for(int i = a1.length - 1; i >= 0; i--) {
            System.out.print(a1[i] + ", ");
        }

        System.out.print("\nПерший = " + args[0].charAt(0) + " Останній = " + args[0].charAt(args[0].length() - 1));

        System.out.println();

        int i = 0;

        while(i < a1.length) {
            System.out.print(a1[i] + ", ");
            i++;
        }

        System.out.println();

        i = a1.length - 1;

        while(i >= 0) {
            System.out.print(a1[i] + ", ");
            i--;
        }
    }
}
