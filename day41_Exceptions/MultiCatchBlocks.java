package day41_Exceptions;

import day19_LoopPractices.IndexOfFirstDuplicatedChar;
import day39_Recap.CydeoTask.Employee;

import java.util.Optional;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null; // not exist

        try {
            System.out.println(employee.getSalary());
        }catch(NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("-----------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch(RuntimeException e ){
            e.printStackTrace();
        }



    }




}
