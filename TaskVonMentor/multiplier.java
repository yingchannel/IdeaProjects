package TaskVonMentor;

import day20_Array.ArraysUtility;

import java.util.Arrays;

public class multiplier {

    public static void main(String[] args) {

        int[] numbers = {12,23,34,25,28,36,37,40};

        int[] newArray=divisible6and4(numbers);
        System.out.println(Arrays.toString(newArray));

    }


    public static int[] divisible6and4(int[] array) {

        int[] newArray = new int[0];

        for (int num : array) {
            if ((num % 4 == 0 || num % 6 == 0)) {
                //newArray= ArraysUtility.addElement(newArray, num);
            }
        }

        return newArray;
    }

}

/*
Create a function that takes an array of numbers as a parameter and returns the number
of values that are a multiplier of either 4 or 6 (or, of course, both).
 */