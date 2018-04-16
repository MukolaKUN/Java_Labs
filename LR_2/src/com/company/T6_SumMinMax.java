package com.company;

public class T6_SumMinMax {
    public static void main(String[] args) {
        int mas[][] = new int[5][5];

        //int min = 100, max = -100;

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (Math.random() * 50);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

        int min =  mas[0][0], max = mas[0][0];

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length; j++) {
                if(mas[i][j] < min) {
                    min = mas[i][j];
                }
                if(mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
        }

        System.out.println();
        System.out.print("Сума мінімального і максимального = " + (min + max));
    }
}
