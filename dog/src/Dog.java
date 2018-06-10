public class Dog {
    private String dogName;
    private int dogAge;

    static int count = 0;

    public Dog() {
        count++;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void voice() {
        System.out.println("Dog says : Гав-Гав!");
    }

}
