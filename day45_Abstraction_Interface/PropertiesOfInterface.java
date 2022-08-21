package day45_Abstraction_Interface;

public interface PropertiesOfInterface {

    /*int a;  // instance variable
    static int b;  //  static variable

     */


    int a = 100;  // static & final by default
    static int b = 200;  // final by default

   /* public PropertiesOfInterface(int a){ // constructor
        this.a= a;
    }

    */

    /*static {  // static block
        b = 100;
    }

     */

    /*public void method1(){  // no object
        System.out.println("Instance method");
    }

     */

    public static void method2(){
        System.out.println("static method");
    }

    public abstract void method3(); // abstract method

    public default void method4(){  // Default method allows us to create a method with body in interface
        System.out.println("Default method");
    }
}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }
}
