package com.company;

public class ForOperations {
    public static void main(String[] args) {
        int[]  x = {1, 2, 3, 5, 7, 9, 12, 34, 56, 65, 153};

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < x.length; i += 2) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < x.length; i++) {
            if(x[i] % 2 == 0) {
                System.out.println("x[" + i + "] = " + x[i]);
            }
        }

        System.out.println("\n");

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        System.out.println("\nКількість елементів = " + x.length);

        Integer.parseInt(args[0]);
        System.out.println("args[0] = " + args[0]);

        int a,b;
        b=10;
        for (a = 10; a >= 5; a--) {
            System.out.println("Значення змінної а= " + a);
            System.out.println("Значення змінної b= " + b);
            b=b+2;
        }
    }
}
