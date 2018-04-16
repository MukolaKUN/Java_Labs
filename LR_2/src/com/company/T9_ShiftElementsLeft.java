package com.company;

public class T9_ShiftElementsLeft {
    public static void main (String [] args){
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        moveLeft(a,2);
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void moveLeft(int[] array, int positions) {
        int size = array.length;
        for (int i = size; i > positions; i--) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}
