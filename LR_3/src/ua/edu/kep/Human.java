package ua.edu.kep;

public class Human {
    private String name;
    private int age;
    private String address;
    private String city;
    private String country;
    private String phone;
    private int height;
    private int weight;

    public String getName(){
        return name;
    }
    public void setName(String value){
        name=value;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int value){
        age=value;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String value) {
        address = value;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String value) {
        city = value;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String value) {
        country = value;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int value) {
        height = value;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int value) {
        weight = value;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String value) {
        phone = value;
    }

    public void print(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Address = " + address);
        System.out.println("City = " + city);
        System.out.println("Country = " + country);
        System.out.println("Height = " + height);
        System.out.println("Weight = " + weight);
        System.out.println("Phone = " + phone);
    }

    public void printAgeInfo(){


        if(age < 12){
            System.out.println("Kid");
        }
        else if(age < 18 ){
            System.out.println("Teen");
        }
        else if (age < 22){
            System.out.println("Student");
        }
        else if(age > 75){
            System.out.println("Elder");
        }
        else if (age > 60 && age <=75){
            System.out.println("Old");
        }
        else if (age >22 && age <=60){
            System.out.println("Normal");
        }
    }

    public void printAdressPhoneInfo(){
        System.out.println("Address = " + address);
        System.out.println("Phone = " + phone);

    }

    public int avgWeight() {

        return height/weight;
    }

    public Human() {
        System.out.println("Ініціалізація об’єкта типу Human");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

}