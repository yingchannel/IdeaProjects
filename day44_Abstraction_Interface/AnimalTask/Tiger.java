package day44_Abstraction_Interface.AnimalTask;

public class Tiger extends AnimalTask implements WildAnimal{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer");
    }
}
/*+
Tiger
					eat(): eats deer
 */