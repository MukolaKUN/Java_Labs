package com.company;

public class T4_SearchMinAndIdx {
    public static void main(String[] args) {
        int mas[][] = new int[5][5];

        int min = 100, idR = 0, idC = 0;

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (Math.random() * 50);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length; j++) {
                if(mas[i][j] < min) {
                    min = mas[i][j];
                    idR = i;
                    idC = j;
                }
            }
        }

        System.out.println();
        System.out.print("min = " + min + " Рядок = " + (idR + 1) + " Стовпчик = " + (idC + 1));
    }
}
