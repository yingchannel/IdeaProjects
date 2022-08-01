package day18_NestedLoop;
import java.util.Scanner;
public class catsAndDogs {


    public static void main(String[] args) {




                Scanner scan = new Scanner(System.in);
                int countOfCats = 0;
                int countOfDogs = 0;
                String word = scan.next();


                for(int i = 0; i <= word.length()-3; i++){
                    String w = word.substring(i,i+3);
                    if(w.equals("cat")){
                        countOfCats++;
                    }
                    if(w.equals("Dog")){
                        countOfDogs++;
                    }
                }
        boolean a = countOfCats==countOfDogs;
        System.out.println(a);


            }
        }
