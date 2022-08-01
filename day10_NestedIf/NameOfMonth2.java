package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {



        /*
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

         */
        int n = 3;
        String name= (n==1)? "Jan": (n==2)?"Feb": (n==3)? "Mar": (n==4)? "Apr": (n==5)? "May" :
                (n==6)? "Jun": (n==7)?"Jul": (n==8)? "Aug": (n==9)? "Sep" : (n==10)?"Oct" : (n==11)?
                        "Nov":"Dec";
        System.out.println(name);

    }
}
