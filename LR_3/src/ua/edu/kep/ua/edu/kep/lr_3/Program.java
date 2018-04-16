package ua.edu.kep.ua.edu.kep.lr_3;

import ua.edu.kep.Human;

public class Program {
    public static void main(String[] args){
        Human h = new Human();
        Human h2 = new Human("Іван Мазепа",60);

        h.setName("Богдан Кловак");
        h.setAge(18);
        h.setAddress("Naberejna 4a");
        h.setCity("ivano-frankivsk");
        h.setCountry("Ukraine");
        h.setHeight(172);
        h.setWeight(62);
        h.setPhone("380960841138");

        h.print();

        h.printAgeInfo();

        h.printAdressPhoneInfo();

        System.out.println("Розподіл ваги = " + h.avgWeight());

        h2.print();
    }


}
