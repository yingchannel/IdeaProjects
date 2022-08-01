package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // outer class can not be static

    static class class1 { // inner class can be static

    }


    public static int num = 100;

    public static void method() {

    }
}

 class A{

    static class B{ // inner class

        public static void method1(){

        }
    }
}

class C{
    public static void main(String[] args) {

        A.B.method1();
    }
}