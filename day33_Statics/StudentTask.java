package day33_Statics;

import java.util.Arrays;

class Student{

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender){
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }
    public Student(String name, char gender, int age){
        this(name,gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID){
        this(name,gender,age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade){
        this(name,gender,age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

}

class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihad", 'M', 28);

        Student student6 = new Student("Suhaib", 'M',27,15);

        Student student7 = new Student("Ali",'M', 42, 30,'A');

        System.out.println(student1 == student2);

        Student[] students = { student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }


}

public class StudentTask {
}
