package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class RemoveElements2 {

    public static int[] removeElement(int[] array, int index){

        if(index<0 || index> array.length){
            System.out.println("Invalid index number: " + index);
            System.exit(0);
        }
        int [] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}
