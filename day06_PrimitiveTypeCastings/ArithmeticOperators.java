package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12 + 1");//121, concatenation

        System.out.println(10+20); // 30, addition
        System.out.println(100-50); // 50, subtraction
        System.out.println(10*6);//60, multiplication


        System.out.println(100/3); // 33
        System.out.println(10/4);//2
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10.0/4.0);//2.5
        System.out.println(10d/4);//2.5

        System.out.println(20/6);//3
        System.out.println(20D/6);//3.3333333333....
        System.out.println(20/6d);//3.3333333333....

        int a = 100;
        double b = a/6; // 16.0

        System.out.println(b);

        double c = (double)a/6;  //16.666666......

        System.out.println(20%5); //0
        System.out.println(20%6); //2
        
    }


}
/*
   + : Addition
   -: Subtraction
   *: Multiplication
   /: Division
   %: Remainder

   integer / integer ===== integer
   decimal/ integer ======decimal
   integer/decimal ======decimal


   in Math : 10/4 = 2.5

    remainder: numerator - (denominator * integer result)
                  10     -  (4       *    2    )
                  10     -    8    =2


 */