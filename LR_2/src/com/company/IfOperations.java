package com.company;

public class IfOperations {

    public static void main(String[] args) {
        //args[0] = "Argument1";
        //args[1] = "Argument2";

        int a = 10;
        int b = 12;

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        if (a > b) {
            System.out.println(a);
        }
        else if (a != b) {
            System.out.println(b);
        }
        else {
            System.out.println("Значення рівні");
        }

        /*
            18.	Перемістіть блоки в операторі if-else таким чином,
            щоб спочатку перевірялося чи значення рівні,
            а потім знаходилося максимальне значення.
        * */
        if (a == b) {
            System.out.println("Значення рівні");
        }
        else if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        /*
            19.	Наступна програма виводить максимальне число, використовуючи скорочений варіант оператора if-then-else:
        */
        System.out.println((a > b) ? a : b);

        a();
        b();
        c(args);
        d(args);
    }

    public static int sum (int a, int b, int c){
        return a + b + c;
    }

    static void line() {
        System.out.println("-------------------------------------------------");
    }

    static void a() {
        line();
        System.out.println("Завдання а)\n");

        int a = 10;
        int b = 12;
        int c = 34;

        int sum = sum(a, b, c);

        System.out.println("найбільше число - " + (((a > b))&&(a > c) ? a : (b > a)&& (b > c)? b : c ));
        System.out.println("найменше число - " + (((a < b))&&(a < c) ? a : (b < a)&& (b < c)? b : c ));
        System.out.println("сума - " + sum);
    }

    static void b() {
        line();
        System.out.println("Завдання б)\n");

        int a = 12;
        int b = 42;
        int c = 13;

        int ab  = a + b;
        int ac = a + c;
        int bc = b + c;

        int max = (((ab > ac))&&(ab > bc) ? ab : (ac > ab)&& (ac > bc)? ac : bc );
        int min = (((ab < ac))&&(ab < bc) ? ab : (ac < ab)&& (ac < bc)? ac : bc );

        System.out.println("сума a + b = " + ab);
        System.out.println("сума a + c = " + ac);
        System.out.println("сума b + c = " + bc);
        System.out.println("найбільша сума = " +max);
        System.out.println("найменша сума = " +min);
        System.out.println("середнє арифметичне найбільшої і найменшої суми = " +(max + min)/2 );
    }

    static void c(String args[]) {
        line();
        System.out.println("Завдання в)\n");

        System.out.println("Aргумент з більшою довжиною - " + ((args[0].length() == args[1].length()) ? "Рівні" : "Нерівні"));
        System.out.println("Aргумент з більшою довжиною - " + ((args[0].length() > args[1].length()) ? args[0] : args[1]));
    }

    static void d(String args[]) {
        line();
        System.out.println("Завдання г)\n");

        int a = 21;
        int b = 12;

        int min = 1;
        int max = 2;

        System.out.println("Text - " + ((args[0].length() == max) ? max : (args[0].length() == min) ? min : (a - b > 0) ? "Text" : "Text2"));
    }
}
