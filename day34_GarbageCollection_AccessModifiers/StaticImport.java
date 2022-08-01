package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
public class StaticImport {
    public static void main(String[] args) {

        System.out.println(Circle.pi); // not necessary
        System.out.println(pi); // direct call the static members not through the class name
        System.out.println(name);
        System.out.println(numbers);


    }
}
