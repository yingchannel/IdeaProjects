package day37_Inheritance.phoneTask;

public final class Samsung extends Phone {


    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand  + " " + model + " is freezing");
    }



}
/*
create a subclass of Phone named Phone
      Variables:
         brand, model, size, price, color

      Methods:
         call(long phoneNumber)
         text(long phoneNumber)
         freeze()
         toString()

          */