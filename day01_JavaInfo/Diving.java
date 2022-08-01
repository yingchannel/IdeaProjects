package day01_JavaInfo;

import java.util.*;

public class Diving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        System.out.println("Enter score for judge 1:");
        score [0] = input.nextFloat();
        System.out.println("Enter score for judge 2:");
        score [1] = input.nextFloat();
        System.out.println("Enter score for judge 3:");
        score [2] = input.nextFloat();
        System.out.println("Enter score for judge 4:");
        score [3] = input.nextFloat();
        System.out.println("Enter score for judge 5:");
        score [4] = input.nextFloat();
        System.out.println("Enter score for judge 6:");
        score [5] = input.nextFloat();
        System.out.println("Enter score for judge 7:");
        score [6] = input.nextFloat();


        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();

        float min = score [0];
        float max = score [0];
        float sum = 0;

        for(int i = 0; i< score.length; i++){
            if(score[i]< min){
                min = score[i];
            }
            if(score[i] > max){
                max = score[i];
            }
            sum += score[i];
        }
        float sumRemain = sum -max-min;
        float total = (float) (sumRemain * diff * 0.6);



        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
