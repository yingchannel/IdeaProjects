package day41_Exceptions;

import day39_Recap.CydeoTask.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        // unchecked exception:

        int a = 10;
        int b = 0;

        // System.out.println( a/b ); // ArithmeticException
        // System.out.println("Wooden");

     char[] characters = {'A', 'B', 'C'};
     //                    0,   1,   2
        //System.out.println(characters[99]);
        //ArrayIndexOutOfBoundsException

        Student student = null; // the object doesn't exist

        // System.out.println( student.getName()); // NullPointerException
        // student.study();

        final String str = "Wooden Spoon"; // now it is in GarbageCollection

        // str = null; // there is no object in str, nothing

         System.out.println(str.toUpperCase()); // NullPointerException

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());


        //-----------------Checked Exception:---------------------

        System.out.println("Hello");

        // Thread.sleep(3000);

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked Exception



    }
}
