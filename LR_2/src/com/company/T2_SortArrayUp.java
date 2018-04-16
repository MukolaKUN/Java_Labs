package com.company;

public class T2_SortArrayUp {

    static int mas[] = new int[10];

    public static void main(String[]args) {
        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random() * 100);
        }

        sortingOnGrowth();

        //print_v();
       // sortingByRecurrance_();

    }

    static void sortingOnGrowth() {
        System.out.println();
        System.out.println("Сортування за спаданням");
        int n = 10;
        int tmp;
        int test = 1;
        while(test > 0) {
            test = 0;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                    test++;
                }
            }
        }
        for(int i = 0; i < n; i++)
            System.out.println("mas[" + i + "] = " + mas[i]);
        System.out.println();
    }


}
