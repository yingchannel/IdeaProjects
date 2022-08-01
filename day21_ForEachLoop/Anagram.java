package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char[] cha1 = str1.toCharArray();
        char[] cha2 = str2.toCharArray();

        System.out.println(Arrays.toString(cha1));
        System.out.println(Arrays.toString(cha2));

        Arrays.sort(cha1);
        Arrays.sort(cha2);

        System.out.println(Arrays.toString(cha1));
        System.out.println(Arrays.toString(cha2));
        
        boolean anagram = Arrays.equals(cha1,cha2);
        System.out.println("anagram = " + anagram);
    }
    
}
