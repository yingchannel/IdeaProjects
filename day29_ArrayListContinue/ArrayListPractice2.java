package day29_ArrayListContinue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David","Ahmed", "Daniel","Aaron","Ahmed", "David"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        System.out.println("----------------------");

        String[] names = {"Mary", "Monica", "Mehray","Musti", "Sumeyra","Hasan", "Beril"};

        //converting array to arraylist

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p -> p.startsWith("M")); // p.charAt(0) == 'M';

        System.out.println(list);

        // converting arraylist to array

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
