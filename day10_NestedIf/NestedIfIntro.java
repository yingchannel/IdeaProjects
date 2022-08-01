package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score =87;

        if(score>=0 && score<=100){

            if (score >= 60) {
                System.out.println("passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid score");
        }
        System.out.println("--------------------");

        int age = 25;
        boolean hasId = true;

        if(hasId){

            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("You must have a ID to buy alcohol");
        }
        System.out.println("------------------");


        int n = 7;
        if(n >=1 && n<=7) {

            if (n == 1) {
                System.out.println("Monday");
            } else if (n == 2) {
                System.out.println("Tuesday");
            } else if (n == 3) {
                System.out.println("Wednesday");
            } else if (n == 4) {
                System.out.println("Thursday");
            } else if (n == 5) {
                System.out.println("Friday");
            } else if (n == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else{
            System.out.println("Invalid Number");

            System.out.println("------------------------------------------------");

            String result = (n == 1) ? "Monday" :(n == 2)? "Tuesday" :(n == 3)? "Wednesday" :( n == 4)? "Thursday"
                    :(n == 5)? "Friday" :(n==6)? "Saturday" : "Sunday";

            System.out.println(result);


        }

    }

}
