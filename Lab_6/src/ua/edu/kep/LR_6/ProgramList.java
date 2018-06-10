package ua.edu.kep.LR_6;

import java.util.*;

public class ProgramList {
    public static void main (String [] args) {
        List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(4);
            list.add(5);
            list.add(2);
            list.add(1);

        List<Integer> list2 = new ArrayList<Integer>();
            list2.add(12);
            list2.add(3);
            list2.add(7);

            list.addAll(list2);

        List<Integer> list3 = new ArrayList<Integer>();

        Random rand = new Random();
            for (int i = 0; i < 12; i++){
                list3.add(rand.nextInt(100));
            }

       Collections.sort(list3);



    }
}
