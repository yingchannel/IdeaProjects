package day34_GarbageCollection_AccessModifiers;

public class staticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");




    }
    static{ // runs first before anything, but only one time

        System.out.println("Static Block1");
    }

    static{

        System.out.println("Static Block2");
    }
    static{

        System.out.println("Static Block3");
    }

}
