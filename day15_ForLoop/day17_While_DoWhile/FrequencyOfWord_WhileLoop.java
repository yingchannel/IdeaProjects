package day15_ForLoop.day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Java Python";

        int frequency = 0;

        while(str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("----------------------");

        String sentence = "cat cat cat cat dog dog dog  cat cat CAT Cat";
        sentence= sentence.toLowerCase();

        int count = 0;

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            count++;
        }
        System.out.println(count);

        System.out.println("---------------");

        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while(s.contains("java")|| s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s= s.replaceFirst("python", "");
                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }

}
/*
Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */