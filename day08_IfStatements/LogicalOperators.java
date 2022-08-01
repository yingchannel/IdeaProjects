package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Stefen";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age>=18 && citizen == "USA";
        //                    18>= 18   &&  ""USA == "USA"
        //                    true      &&    true  ==> true

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("___--------------------------");

        String name2 = " Josh ";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore>=700 && age2 >= 21 && income>= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("------------------------");

        String name3 = " Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name + " is eligible to register: " + isEligible3);

        System.out.println("-------------------------");

        String student = "Ana";
        double gpa = 2.5;
        int familyIncome = 10000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("-------------------");

        int score = 85;
        boolean passed = score>= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);






    }
}
