package day40_FinalKeyword;

public class DOg extends Animal{


    public DOg(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName()+ " is eating dog food");
    }

    //public void drink(){ // final methods can not be overridden
        //System.out.println( getName() + " is drinking beer");
    //}


}
// eating dog food