package day44_Abstraction_Interface.AnimalTask;

public final class Dog extends AnimalTask implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }

    public void play(){
        System.out.println(getName() + " is playing with ball");
    }
}
/*
Dog
					eat(): eats Pizza
 */