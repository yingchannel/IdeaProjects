package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}

/*
 Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        String result = "";

        for (int i = str.length() -1; i >= 0; i--) {
            char ch = str.charAt(i);

            result += ch;
        }

        System.out.println("result = " + result);

    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */