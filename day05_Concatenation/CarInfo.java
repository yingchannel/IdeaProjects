package day05_Concatenation;
/*
1. Create a class called CarInfo.java
2. Declare the following variables:
1. year 2. make
3. model 4. miles 5. color 6. price
3. Use concatenation to print the full info of the car in the following format:
Year Make Model, Miles, Color, Price. 2018 Toyota Camry, 50000 miles, Red, $19000.
 */
public class CarInfo {

    public static void main(String[] args) {

        short year = 2018;
        String make = "Toyota";
        String model = "Camry";
        String miles = "50000 miles";
        String color = "Red";
        String price = "$19000";

        //2018 Toyota Camry, 50000 miles, Red, $19000

        System.out.println(year + " " + make + " " + model + ", "
         + miles + ", " + color + ", " + price);
    }
}
