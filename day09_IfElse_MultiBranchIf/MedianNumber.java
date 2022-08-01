package day09_IfElse_MultiBranchIf;

public class MedianNumber {
    /*
    2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
     */
    public static void main(String[] args) {
        int a =10,
            b = 15,
            c = 20;

        boolean aIs = b>a && c<a ||  c>a && b<a;
        boolean bIs = c>b && a<b ||  c<b && a>b;
        boolean cIs = c<a && c>b ||  c<b && c>a;//!aIs &&!bIs

        if(aIs){
            System.out.println(a + " could be median number");
        }
        if(bIs){
            System.out.println(b + " could be median number" );
        }
        if(cIs){
            System.out.println(c + " could be median number");
        }


    }
}
