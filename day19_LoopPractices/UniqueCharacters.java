package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";

        for (char j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(ch == each){
                    count++;
                }
            }
            if(count == 1){
               result+= ch;
            }


        }
        System.out.println(result);



    }
}
/*
2. Write a program that can find the unique characters from a string without using
indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */