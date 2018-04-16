package com.company;

public class T5_SumOdd {
    static int mas [] = new int [10];

    public static void main(String[]args) {
        int Sum = 0;

        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random()* 20);
            System.out.println("mas["+ i +"] = " + mas[i]);
        }

        for (int i = 0;i <  10;i++) {
            if (mas[i]%2 != 0)
                Sum += mas[i];
        }

        System.out.println();
        System.out.println("Sum = "+ Sum);
    }
}
