package TaskVonMentor;

public class PalindromeString {
    public static void main(String[] args) {

       IfPalindrome("level");
        System.out.println(IfPalindrome("level"));
    }

   public static boolean IfPalindrome(String str){

        String reverse = "";
        boolean ifPalindrome = false;
       for (int i = str.length()-1; i >= 0; i--) {
           reverse += str.charAt(i);
       }
           if(reverse.equalsIgnoreCase(str)){
              ifPalindrome = true;
           }
    return ifPalindrome;
    }
}
/*
Write a function that tests if a string is a palindrome.
 */