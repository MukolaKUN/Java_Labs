package ua.edu.kep.LR_6;

import java.util.ArrayList;
import java.util.List;

public class ProgramListString {
    public static void main(String [] args){
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("world");
        strings.add("!");

//        for(String each : strings){
//            System.out.print(each + " ");
//        }
//        System.out.println();
//        System.out.println(strings.size());


        List<String> strings2 = new ArrayList<String>();
            strings2.add("My");
            strings2.add("Name");
            strings2.add("si");
            strings2.add("Bohdan");




//        public static void compareStrings(List<String> strings, List<String> strings2) {
//
//            if (strings.size() == strings2.size()) {
//                if (strings.equals(strings2)) {
//                    System.out.println("true");
//                }
//            } else System.out.println("false");
//        }

//        System.out.println(strings.get(0));

//        int s = strings.size();
//
//        for (int i = s; i >= 0; i--){
//            System.out.println(strings.get(i));
//        }



        strings.indexOf("world");

        public  static boolean containsString(List<String> strings, String strings2) {
            for (String each : strings) {
                if (each.equals(strings2)) {
                    return true;
                }
            }
            return false;
        }


    }
}
