package com.company;

public class WhileOperations {
    public static void main(String args[]) {
        int a = 10;
        int k = 5;
        int i = 0;

        while (i < k) {
            System.out.println("a + i = " + (a + i));
            i++;
        }

        int z = -5;
        i = 0;
        while(z <=5 ) {
            System.out.println("Крок " + i + " - Значення рівне " + z);
            z++;
        }
    }
}
