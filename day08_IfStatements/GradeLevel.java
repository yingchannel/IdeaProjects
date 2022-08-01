package day08_IfStatements;
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */
public class GradeLevel {
    public static void main(String[] args) {

        byte GradeLevel = 8;

        boolean ElementarySchool = GradeLevel>=1 && GradeLevel<=5;
        boolean MiddleSchool = GradeLevel>=6 && GradeLevel<=8;
        boolean HighSchool = GradeLevel>=9 && GradeLevel<=12;
        boolean College = GradeLevel>=13 && GradeLevel<=16;
        boolean GradeSchool = GradeLevel>=17 && GradeLevel<=18;

        if(ElementarySchool){
            System.out.println("Elementary school");
        }
        if(MiddleSchool){
            System.out.println("Middle school");
        }
        if(HighSchool){
            System.out.println("High school");
        }
        if(College){
            System.out.println("College");
        }
        if(GradeSchool){
            System.out.println("Grade School");
        }



    }
}
