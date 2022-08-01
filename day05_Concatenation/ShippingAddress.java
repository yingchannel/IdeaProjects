package day05_Concatenation;

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
  1. name
  2. buildingNumber
  3. streetName
  4. city
  5. state
  6. zipCode
3. Use concatenation to print the full address
 */
public class ShippingAddress {

    public static void main(String[] args) {
        String name = "James King",
               buildingNumber = "1123B",
                streetName = "Jones Brand Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n"
        + city + ", " + state + " " + zipCode);





    }
}
