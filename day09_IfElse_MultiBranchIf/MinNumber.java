package day09_IfElse_MultiBranchIf;

public class MinNumber {
/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */
    public static void main(String[] args) {
        int n1= 100;
        int n2=200;
        boolean n1Min = n1<n2;
        boolean n2Min = n2<n1;
        boolean equal = n1==n2;
        if(n1Min){
            System.out.println(n1+ " is the minimum Number");
        }
        if(n2Min){
            System.out.println(n2+ " is the minimum Number");
        }
        if(equal){
            System.out.println(n1 +" is equal to " +n2);
        }


    }
}
