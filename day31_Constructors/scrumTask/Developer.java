package day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + Salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing Bug");
    }


}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the files

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */