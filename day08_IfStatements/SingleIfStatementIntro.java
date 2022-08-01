package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) { //even number
            System.out.println(number + " is even number");
        }

        if (oddNumber) {//not even number
            System.out.println(number + " is odd number");
        }

        System.out.println("-----------------");

        int n = 200;

        //positive
        if(n>0) {
            System.out.println(n + " is positive");
        }
        //negative
        if(n<0){
            System.out.println(n + " is negative");
        }

        //zero
        if(n==0){
            System.out.println(n + " is zero");
        }
    }
}