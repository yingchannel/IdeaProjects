package day20_Array;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you want to enter?");
        int length = scan.nextInt();
        double sum = 0;
        int [] numbers = new int[length];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        double averageNumber = sum/numbers.length;

        System.out.println("averageNumber = " + averageNumber);
    }


}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */