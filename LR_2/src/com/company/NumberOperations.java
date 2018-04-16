package com.company;

public class NumberOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 43;
        /*
            5.	Виконайте операції додавання, віднімання, множення та ділення для типу int.
        */
        System.out.println("Тип даних int");
        System.out.println();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        /*
            6.  Змініть текст програми, добавивши виконання та вивід арифметичних операції
            для всіх числових типів. Поміняйте початкові значення змінних. Збережіть текст програми
            та вкажіть її разом із результатами виконання у звіті.
        */
        long lg_1 = 765;
        long lg_2 = 543;

        double db_1 = 9.8;
        double db_2 = 6.7;

        System.out.println("lg_1 * lg_2 = " + (lg_1 * lg_2));
        System.out.println("db_1 - db_2 = " + (db_1 - db_2));

        float c = (float) 10.3;
        float d = (float) 43.2;

        System.out.println();
        System.out.println("Тип даних float");
        System.out.println();

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));

        System.out.println();
        System.out.println("Тип даних boolean");
        System.out.println();
        boolean e = true;
        boolean f = false;

        System.out.println("e ^ f = " + (e ^ f));
        System.out.println("e | f = " + (e | f));
        System.out.println("e & f = " + (e & f));
        System.out.println("!e = " + (!e));
        System.out.println("!f = " + (!f));
    }
}
