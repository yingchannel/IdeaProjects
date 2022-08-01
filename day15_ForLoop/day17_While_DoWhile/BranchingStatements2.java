package day15_ForLoop.day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if(i == 'C'){
                continue;
            }
            System.out.println(i);//A, B, D, E
        }


        System.out.println("-----------------------------");
        // print all the even number between 1-10 (skip the odd numbers)

        for (int i = 1; i <= 10; i++) {

            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }



        System.out.println("-----------------------------");
        // print all the odd number between 1-10

        for (int i = 1; i <=10 ; i++) {

            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }


    }
}
