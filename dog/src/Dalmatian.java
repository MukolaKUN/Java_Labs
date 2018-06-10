public class Dalmatian extends Dog {
    public static void main(String[] args) {
    Dog dog1 = new Dog();

    dog1.setDogName("Barsik");
    System.out.println("Name of dog is " + dog1.getDogName());
    dog1.setDogAge(2);
    System.out.println(dog1.getDogName() + " is " + dog1.getDogAge() + " years old ");
    dog1.voice();
    System.out.println();

    Dog dog2 = new Dog();

    dog2.setDogName("Topa");
    System.out.println("Name of dog is " + dog2.getDogName());
    dog2.setDogAge(3);
    System.out.println(dog2.getDogName() + " is " + dog2.getDogAge() + " years old ");
    dog2.voice();
    System.out.println();
    System.out.println("Statistic " + Dog.count);
    }
}
