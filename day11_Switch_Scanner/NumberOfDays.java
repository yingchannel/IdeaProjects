package day11_Switch_Scanner;
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){

			}else{
				Invalid
			}
 */
public class NumberOfDays {
    public static void main(String[] args) {

       int number = 9;
       int year = 2000;

       String result = "";

       if(number >= 1 && number<=12){

           switch(number) {
               case 2:
                   result = (year%4 ==0)? "29 days" : "28 days";

                   /*if(year %4 ==0) {
                       System.out.println("29 days");
                   }else{
                       System.out.println("28 days");

                    */

                   break;

               case 4: case 6: case 9: case 11:
                   result = "30 days";
                   break;

               default:// 1,3,5,7,8,10,12
                   result = "31 days";
           }
       }else{
           result = "Invalid Number";
       }
        System.out.println(result);
    }
}
