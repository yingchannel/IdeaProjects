package day05_Concatenation;
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName 2. lastName
3. Use concatenation to print the full address
 */
public class FullName {
    public static void main(String[] args) {


String firstName ="Cydeo";
String lastName = "School";
int age = 45;
String jobTitle = "SDET";
String CompanyName = "Apple Inc";
double salary = 100000.58;


String fullName = firstName + "" + lastName;

// Full name of the person is _____

        System.out.println("Full name of the person is " + fullName );

        // ___ is __ years old.

        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary

        System.out.println(fullName + " is " + jobTitle +", works at " + CompanyName
                +",and " + fullName + "'s salary is $" + salary );
   }
}
