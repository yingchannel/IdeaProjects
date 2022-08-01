package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;

        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with a remainder of "+ a);


    }
}
/*
1.  Write a program that can divide two positive numbers without using / (division)
and * (multiplication) and % operators
 */