package day44_Abstraction_Interface.AnimalTask;

public final class Cat extends AnimalTask implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Biryani");
    }

    @Override
    public void play() {

    }
}



/*
	Cat
					eat(): eats Biryani

 */