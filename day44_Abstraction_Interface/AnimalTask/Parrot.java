package day44_Abstraction_Interface.AnimalTask;

public class Parrot extends AnimalTask implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 20km/h");
    }
}
/*
Parrot
					eat(): eats chocolate
 */