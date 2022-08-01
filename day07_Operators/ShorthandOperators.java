package day07_Operators;

import javax.imageio.stream.ImageInputStreamImpl;
import java.awt.*;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number);//100

        number = 200;
        System.out.println("number = " + number);//200

        String word ="Java Programming";
        System.out.println("word = " + word);//Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word); //Cydeo

        System.out.println("---------------------");

        //Addition Assignment
        double availableBalance = 1000.50;
        availableBalance += 300; //1300.50
        System.out.println("availableBalance = " + availableBalance);//1300.5

        //withdrawing 500$

        availableBalance -= 500; //1300.50 - 500 = 800.50

        int amount = 127;
        int quarters =127/25;
        int cents = 127% 25;
        System.out.println("cents = " + cents);



    }


}
