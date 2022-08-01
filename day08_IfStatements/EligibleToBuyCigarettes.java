package day08_IfStatements;
/*
1. Given a number (byte) age, write a program that can check if
the person is eligible to buy Cigarettes
 */
public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        byte age = 16;
        boolean isEligible = age>=18;
        if(isEligible){
            System.out.println("Eligible to buy Cigarettes");
        }
        if(!isEligible){
            System.out.println("Not eligible to buy Cigarettes");
        }
    }
}
