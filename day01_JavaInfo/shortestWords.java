package day01_JavaInfo;


import java.util.Arrays;

public class shortestWords {
    public static void main(String[] args) {


        String [] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};



        String [] arr1 = Arrays.copyOfRange(arr, 0,2);
        String [] arr2 = Arrays.copyOfRange(arr, 2, 4);
        String [] arr3 = Arrays.copyOfRange(arr, 4, 6);
        String [] arr4 = Arrays.copyOfRange(arr, 6, 8);


        System.out.print(Arrays.toString(arr1)+'\n');

        System.out.print(Arrays.toString(arr2)+'\n');

        System.out.print(Arrays.toString(arr3)+'\n');

        System.out.print(Arrays.toString(arr4)+'\n');



    }


}
