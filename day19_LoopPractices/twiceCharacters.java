package day19_LoopPractices;

import java.util.Scanner;

public class twiceCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(ch == each){
                    count++;
                }
            }
            if(count == 2){
                result+= ch;
            }
        }

        for (int k = 0; k < str.length(); k++) {
            char single = result.charAt(k);

            if(!result.contains("" +single)){
               result+= single;
            }

        }
        System.out.println(result);

    }
}
/*
3. Write a program that can display all the characters that appeared twice in the string.
 */