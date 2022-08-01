package day10_NestedIf;
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print
which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
public class GradeLevel {
    public static void main(String[] args) {
        byte grade =12;
        String result = "";

        if(grade>=1 &&grade <= 18){
            if(grade>=1 && grade<=5){
                result = "Elementary school";
            }else if(grade>=6 &&grade <= 8){
                result = "Middle school";
            }else if(grade>=9 &&grade <= 12){
                result = "High school";
            }else if(grade>=13 &&grade <= 16){
                result= "College";
            }else{
                result=" Grad School";
            }


        }else{
            result= "Invalid grade level given";
        }
        System.out.println(result);


    }

}
