package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        while(true) {

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re enter,would you like to enter another number?");
                answer = scan.next().toLowerCase();
            }


            if(answer.equals("no")) {
                break;
            }



        }
    }
}
/*
2. Write a program that asks user to enter a number , and check if the number
is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enter invalid answer, repeat the previous steps
 */