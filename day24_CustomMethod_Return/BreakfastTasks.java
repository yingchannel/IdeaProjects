package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args){

        initials("Wooden","Spoon");
        System.out.println("-----------------------------");

        domain("annchen20092009@hotmail.com");
        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");

        nameOfMonth(5);

    }
//1. Create a method that can display the initials of the person (initials(String firstName,String lastName)
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
        
    }

//2. Create a method that can display the domain of the email
    public static void domain(String EmailAddress){

        String domain = EmailAddress.substring(EmailAddress.indexOf("@")+1, EmailAddress.indexOf("."));
        System.out.println(domain);
    }

//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String month = "";
        if(number>=1 && number<=12){

            month = (number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April":
                    (number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?
                            "September":(number==10)?"October":(number==11)?"November":"December";
        }else{
            month = "Invalid";
        }
        System.out.println("Month name = " + month);
    }

}
/*
1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */