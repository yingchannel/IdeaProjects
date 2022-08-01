package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();//Java ProgrammingEnter

        System.out.println("Enter your building number: ");
        String building= scan.next();//7925A

        scan.nextLine();// Enter

        System.out.println("Enter your Street name: ");
        String street = scan.nextLine();//Jones Branch DriveEnter

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();//McLeanEnter

        System.out.println("Enter your state: ");
        String state = scan.next();// VAEnter

        System.out.println("Enter your zip code");
        String zip = scan.next();//22012Enter

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);




    }
}

/*
1. Enter your full name      nextLine()
2. Enter your building number      next()
3. Enter your Street name      nextLine()
4. Enter your city name        nextLine()
5. Enter your state        nextLine()
6. Enter your zip code     nextLine()

display the shipping address

 */