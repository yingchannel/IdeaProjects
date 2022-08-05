package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");
        }
        System.out.println("Test1 completed");
        System.out.println("-------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch(RuntimeException a ){

            a.printStackTrace();

            // System.out.println( a.getMessage());
        }

        System.out.println("Test2 completed");

        System.out.println("-------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test3 completed");
    }
}
