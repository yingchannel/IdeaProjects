package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;
        /*
        if(s>=0 && s<=100){

            if(){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        */

       String result=  (s>=0 && s<=100)? (s>=60)? "Passed": "Failed" :"Invalid Score";
        System.out.println(result);
    }
}
