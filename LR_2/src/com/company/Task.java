package com.company;

public class Task {
    public static void main(String args[]) {
        int[] v = new int[10];

        for(int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 8 + 4);
            System.out.println(" " + v[i]);
        }

        int min = 100, max = -100;

        for(int i = 0; i < v.length; i++) {
            if(v[i] > max) {
                max = v[i];
            }
            if(v[i] < min) {
                min = v[i];
            }
        }
        v[0] = min;
        System.out.println("\nmin =  " + min + "\nmax = " + max);

        final int n = 10;
        int c;
        boolean is = true;

       // do {
           // is = false;
            for (int i = 0; i < v.length; i++) {
                if(rez(min, v[i]) > i ) {
                    c = rez(min, v[i]);
                    v[c] = v[i];
                  //  is = true;
                }
            }
        //} while (is);
        /* SortBubble */
       /* do {
            is = false;
            for (int i = 1; i < n; i++)
                if (v[i - 1] > v[i])
                {
                    c = v[i];
                    v[i] = v[i - 1];
                    v[i - 1] = c;
                    is = true;
                };
        } while (is);*/

        System.out.println("\n");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" " + v[i]);
        }
    }

    static int rez(int min, int x) {
        return x - min;
    }
}
