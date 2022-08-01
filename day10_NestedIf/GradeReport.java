package day10_NestedIf;
/*
90~100: Excellent
80~90: Great
70~80: Good
60~70: Passed
0~59: failed
 */

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
        /*if(score >= 0&& score <=100){
            if(score>=90){// false: score<90
                System.out.println("Excellent");
            }else if(score>= 80){
                System.out.println("Great");
            }else if(score>=70){
                System.out.println("Good");
            }else if(score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        System.out.println("-----------------");

        String result = ""; //temporary

        if(score >= 0&& score <=100){
            if(score>=90){// false: score<90
                result ="Excellent";
            }else if(score>= 80){
                result = "Great";
            }else if(score>=70){
                result = "Good";
            }else if(score>=60){
                result = "Passed";
            }else{
                result = "failed";
            }
        }else{
            result = "Invalid Score";
        }
        System.out.println(result);

         */
        System.out.println("------------------");

        String result = (score >= 0 && score <=100)?(score>=90)? "Excellent" : (score>=80)? "Great":
                (score>=70)?"Good":(score>=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);



    }
}

