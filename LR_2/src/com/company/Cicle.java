package com.company;

public class Cicle {
    public static void main(String[] args) {
        System.out.println("Покрокове значення змінної рівне");

        for (int z = -5; z <= 5; z++) {
            System.out.println("Значення рівне " + z);
        }

        int i = 0;
        for (int z = -5; z <= 5; z++) {

            System.out.println("Крок " + i + " - Значення рівне " + z);
            i++;
        }
    }
}
