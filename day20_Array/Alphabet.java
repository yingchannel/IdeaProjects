package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; //[ Z- A]

       /* alphabets[0] = 'Z';
        alphabets[1] = 'Y';*/

        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }


        /*for (char i = 0, j = 'Z'; i <alphabets.length ; i++, j--) {

            alphabets[i] = j;
        }*/

        System.out.println(Arrays.toString(alphabets));


    }
}
