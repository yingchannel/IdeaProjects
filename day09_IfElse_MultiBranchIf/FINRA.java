package day09_IfElse_MultiBranchIf;
/*
3. Create a class called FINRA, Write a function which prints out the number. but for number 
which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple 
of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, 
print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN
                number = 10
            output:
                RA
                number = 15
            output:
                FINRA
 */
public class FINRA {
    public static void main(String[] args) {
        int num= 28;
        String result = "";
        
        if(num%3==0) {
            result = "FIN";
        }else if(num%5==0){
            result = "RA";
        }else if(num%3==0 && num%5==0){
            result = "FINRA";
        }else{
            result = ""+num;
        }

            System.out.println("result = " + result);
    }
}
