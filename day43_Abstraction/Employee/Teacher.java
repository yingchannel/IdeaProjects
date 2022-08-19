package day43_Abstraction.Employee;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }
}
