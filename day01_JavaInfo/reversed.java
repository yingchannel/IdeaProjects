package day01_JavaInfo;

import java.util.Arrays;

public class reversed {


    public static void main(String[] args) {

        String  sentence = "Java is fun";

        String reversed = "";

        String [] sent = sentence.split(" ");
        System.out.println(Arrays.toString(sent));

        for( int i = 0; i< sent.length; i++){

            reversed = sent[i] +  " " + reversed;
        }

        System.out.println(reversed);
    }
}
