package com.company;

public class T1_Factorial {

    public static void main(String[]args) {
        whileF();
        do_while();
        forF();
    }

    static void whileF() {

        System.out.println("while");
        int i = 1, fact = 1, x = 10;

        while( i <= x)
        {
            fact = fact * i;
            i++;
        }
        print(x, fact);
    }

    static void do_while() {
        System.out.println("---------------------------------------");

        System.out.println("do-while");

        int i = 1, fact = 1, x = 10;

        do
        {
            fact = fact * i;
            i++;
        } while( i <= x);
        print(x, fact);

    }

    static void forF() {
        System.out.println("---------------------------------------");

        System.out.println("метод for");

        int i, fact = 1, x = 10;

        for(i = 1; i <= x; i++)
        {
            fact = fact * i;
        }
        print(x, fact);
    }

    static void print(int x, int y) {

        System.out.println("Факторіал з " + x + " = " + y);
    }

}



