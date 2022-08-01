package day04_Variable;

public class PrimitivesIntro {

    public static void main(String[] args) {
        //age: 38 years old

        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160;   // 160 is out of byte's range
        // byte num = -129;  // -129 is out of byte's range
        short weight = 160; // 160 is within the range of short

        // salary: 100000 $
        //short salary = 100000; //100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset =3_333_333_333l;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 25000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true ;
        boolean isMarried = false ;
        boolean result = 100>300 ;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country= "USA";
        System.out.println("country = " + country);


    }


}
