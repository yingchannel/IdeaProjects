package day15_ForLoop.day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str= "AAABBBC";
        char ch = 'A';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(eachChar == ch){
               count++;
            }
        }
        System.out.println(count);
    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */