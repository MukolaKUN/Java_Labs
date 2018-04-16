package com.company;

public class SumArr {
    static int a[] = new int[10];
    static int b[] = new int[28];

    static void print_() {
        System.out.println("Масив \n");
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
    }


    static void sum() {
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += a[i];
        System.out.println("");
        System.out.println("Сума елементів одновимірного масиву " + sum + "\n-----------------------");
    }


    public static void main(String args[]) {
        for (int i = 0; i < 10; i++)
            a[i] = (int) (Math.random() * 6);
        print_();
        sum();

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 8 + 4);
            System.out.println("b[" + i + "] = " + b[i]);
        }

        avg();
        avgS();
    }

    static void avg() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }

        avg = sum / b.length;
        //System.out.println("");
        System.out.println("Середнє арифметичне елементів одновимірного масиву = " + avg);
    }

    static void avgS() {
        int sum = 0;
        int avg = 0;
        for (int i = b.length - 5; i < b.length; i++) {
            sum += b[i];
        }

        avg = sum / 5;
        //System.out.println("");
        System.out.println("--------------------------------\nСереднє арифметичне 5-ти елементів одновимірного масиву = " + avg);
    }
}
