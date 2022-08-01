package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
         // System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateDta);
        // they are nor visible outside the package or class

        AccessModifiers.method1();

        //AccessModifiers.method2(); // default

        //AccessModifiers.method3(); // private

    }
}
