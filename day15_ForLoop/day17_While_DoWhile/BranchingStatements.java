package day15_ForLoop.day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 'A'; i <= 'Z'; i++) {

            if(i== 'F'){
                break;//Exits the loop
            }

            System.out.println(i+ "");
        }

        System.out.println();
        System.out.println("------------------");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num<0){
                break;
            }


        }






    }
}
