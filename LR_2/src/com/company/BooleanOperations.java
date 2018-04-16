package com.company;

public class BooleanOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a=" + a + ", b = " + b); // виведемо початкове
        // значення змінних
        a = b;
        System.out.println("a=" + a); // виведемо змінене значення змінної а
        a = (2 > 1 && b == false); // присвоєння результату логічного виразу
        System.out.println("a=" + a);

        /*
            9.	Виконайте дану програму та вкажіть у звіті результати виконання.
            Добавте в програму додаткові логічні вирази, які би повертали true та false.
            Вкажіть текст програми та результати її виконання в звіті.
        */

        b = (5 == 5 && 3 < 6 && a != false);
        System.out.println("b = " + b);
    }
}
