package com.company;

public class T10_ShiftElementsRight {
    public static void main (String [] args){
        int[] a = {1,2,3,4,5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        moveRight(a,2);
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void moveRight(int[] array, int positions) {
        int size = array.length;
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}
