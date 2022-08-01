package day08_IfStatements;
/*
1. write a program that can display the name of the month

			number = 1 ~ 12
 */
public class NameOfTheMonth {

    public static void main(String[] args) {

        int a = 3;
        boolean Jan= a==1;
        boolean Feb= a==2;
        boolean Mar= a==3;
        boolean Apr= a==4;
        boolean May= a==5;
        boolean Jun= a==6;
        boolean Jul= a==7;
        boolean Aug= a==8;
        boolean Sep= a==9;
        boolean Oct= a==10;
        boolean Nov= a==11;
        boolean Dec= a==12;

        if(Jan){
            System.out.println("January");
        }
        if(Feb){
            System.out.println("February");
        }
        if(Mar){
            System.out.println("March");
        }
        if(Apr){
            System.out.println("April");
        }
        if(May){
            System.out.println("May");
        }
        if(Jun){
            System.out.println("June");
        }
        if(Jul){
            System.out.println("July");
        }
        if(Aug){
            System.out.println("August");
        }
        if(Sep){
            System.out.println("September");
        }
        if(Oct){
            System.out.println("October");
        }
        if(Nov){
            System.out.println("November");
        }
        if(Dec){
            System.out.println("December");
        }

    }
}
