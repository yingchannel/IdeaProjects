package day44_Abstraction_Interface.AnimalTask;

public interface Playable {

    boolean isFriendly = true; // static & final

    /*public static void method1(){
        System.out.println(isFriendly);
    }
     */

    void play(); // abstract by default
}
