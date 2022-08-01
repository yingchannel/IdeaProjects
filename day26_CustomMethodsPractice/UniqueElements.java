package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5,2.5,3.5,4.5,4.5,4.5};
        double [] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){

        int[] result = {};//new int[0]
        for (int each : array) {
           if(ArraysUtility.frequencyOfElement(array,each) ==1){
               result = ArraysUtility.addElement(result,each);
           }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){

        double[] result = {};//new double[0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){

        char[] result = {};//new String[0]
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){

        String[] result = {};//new String[0]
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    
}
