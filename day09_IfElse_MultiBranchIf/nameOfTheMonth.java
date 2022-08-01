package day09_IfElse_MultiBranchIf;

public class nameOfTheMonth {
    public static void main(String[] args) {

        int n = 3;
        String name;

        if(n==1){
            name = "January";
        }else if(n==2){
            name = "February";
        }else if(n==3){
            name = "March";
        }else if(n==4){
            name = "April";
        }else if(n==5){
            name = "May";
        }else if(n==6){
            name = "June";
        }else if(n==7){
            name = "July";
        }else if(n==8){
            name = "August";
        }else if(n==9){
            name = "September";
        }else if(n==10){
            name = "October";
        }else if(n==11){
            name = "November";
        }else{
            name = "December";
        }
        System.out.println("Month: "+ name);
    }

}
