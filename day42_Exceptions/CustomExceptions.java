package day42_Exceptions;

class FadyException extends RuntimeException{// custom unchecked exception

    public FadyException(){
        System.out.println("It's time for break");
    }

    public FadyException(String message){
        super(message);
    }

}

class NoBreakException extends Exception{// custom checked exception

}

public class CustomExceptions {
    public static void main(String[] args) {

        throw new FadyException();
    }

}



