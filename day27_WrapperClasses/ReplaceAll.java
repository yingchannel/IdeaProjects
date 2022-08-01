package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr = replaceAll(arr, 30,300);

        System.out.println(Arrays.toString(arr));
    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]== oldElement){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]== oldElement){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]== oldElement){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i].equals( oldElement)){
                array[i] = newValue;
            }
        }
        return array;
    }
}
