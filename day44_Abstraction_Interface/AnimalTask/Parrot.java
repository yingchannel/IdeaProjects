package day44_Abstraction_Interface.AnimalTask;

public class Parrot extends AnimalTask {

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }
}
/*
Parrot
					eat(): eats chocolate
 */