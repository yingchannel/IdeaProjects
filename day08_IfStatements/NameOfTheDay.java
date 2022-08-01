package day08_IfStatements;
/*
2. write a program that can display the name of the day

			number = 1 ~ 7
 */
public class NameOfTheDay {
    public static void main(String[] args) {

        int num =4;
        boolean Monday = num ==1;
        boolean Tuesday = num ==2;
        boolean Wednesday = num ==3;
        boolean Thursday = num ==4;
        boolean Friday = num ==5;
        boolean Saturday = num ==6;
        boolean Sunday = num ==7;

        if(Monday){
            System.out.println("Monday");
        }
        if(Tuesday){
            System.out.println("Tuesday");
        }
        if(Wednesday){
            System.out.println("Wednesday");
        }
        if(Thursday){
            System.out.println("Thursday");
        }
        if(Friday){
            System.out.println("Friday");
        }
        if(Saturday){
            System.out.println("Saturday");
        }
        if(Sunday){
            System.out.println("Sunday");
        }
    }
}
