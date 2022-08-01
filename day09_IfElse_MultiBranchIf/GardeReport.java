package day09_IfElse_MultiBranchIf;
/*
1. grade report ==> A, B, C, D, F
 */
public class GardeReport {
    public static void main(String[] args) {
        int score = 78;
        String report;

        if(score>=90 && score <=100){
            report = "A";
        }else if(score>=80 && score<=89){
            report = "B";
        }else if(score>=70 && score<=79){
            report = "C";
        }else if(score>=60 && score<= 69){
            report = "D";
        }else{
            report = "F";
        }
        System.out.println("Report: "+ report);


    }
}
