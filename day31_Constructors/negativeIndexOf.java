package day31_Constructors;

public class negativeIndexOf {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";

        String s2 = s.substring(5);
        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        System.out.println(index1);
        System.out.println(index2);

        if(index1 ==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
    }

}
