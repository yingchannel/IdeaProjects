package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0);//false
        System.out.println( num2 < 0 );//true

        int a = 5;

        ++a;//6; pre increment : increases the value by 1 right now

        --a; // 5; pre decrememt: decreases the value by 1 right now

        int b = 100;

        System.out.println(++b);// 101 pre increment

        int c= 100;

        System.out.println(c++);// 100 post increment: first passes the current value, then increases the value by 1
        System.out.println(c); // 101
        System.out.println("------------------------");

        int x = 200;

        System.out.println(--x);//199, pre

        int y =200;

        System.out.println(y--); // post , 200
        System.out.println(y); // 199

        System.out.println("-----------");

        int z = 45;
        System.out.println(++z); //pre: 46
        System.out.println(z++); //post: 46
        System.out.println(z); // 47

        int q = 30;
        System.out.println(--q);//29, q = 29
        System.out.println(q--);//29, q = 28
        System.out.println(q);//28



    }
}
