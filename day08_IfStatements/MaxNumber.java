package day08_IfStatements;
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then
print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */
public class MaxNumber {
    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 35;

        boolean num1IsMax = num1>num2;
        boolean num2IsMax = num2>num1;
        boolean equal = num1==num2;

        if(num1IsMax){
            System.out.println(num1 + " is maximum number");
        }
        if(num2IsMax){
            System.out.println(num2 + " is maximum number");
        }
        if(equal){
            System.out.println("Equal");
        }


    }
}
