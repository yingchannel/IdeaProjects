package day12_Scanner;

import java.util.Scanner;

/*
1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */
public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double r = scan.nextDouble();

        double area= r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scan.close();




    }
}
