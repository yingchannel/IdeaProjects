package day01_JavaInfo;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str = "aaabggghhh";

        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);
    }
}
