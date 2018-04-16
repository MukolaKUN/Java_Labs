package com.company;

public class Main{
    public static void main(String[] args) {
        codeBlock();
    }

    static void codeBlock() {

        int a,b;
        b=10;
        for (a = 10; a >= 5; a--) {
            System.out.println("Значення змінної а= " + a);
            System.out.println("Значення змінної b= " + b);
            b=b+2;
        }
    }
}
