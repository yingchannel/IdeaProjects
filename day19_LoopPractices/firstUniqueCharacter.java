package day19_LoopPractices;

import java.util.Scanner;

public class firstUniqueCharacter {
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
            if(count == 1){
                result += ch;
            }
        }

        System.out.println(str.indexOf(result.charAt(0)));
    }
}
