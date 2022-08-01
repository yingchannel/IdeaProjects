package day01_JavaInfo;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxLength {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below


        int maxIndex = 0;
        for( int i = 0; i < words.length; i++){

            if(words[i].length()> words[maxIndex].length()){
                maxIndex = i;
            }

            System.out.println(words[maxIndex]);
        }


    }
}
