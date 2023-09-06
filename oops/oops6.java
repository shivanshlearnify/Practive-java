package oops;

public class oops6 {
    static class Employee{
        String name;
        String jobTitle;
        double salary;

    public Employee(String name, String jobTitle, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public String getjobTitle(){
        return jobTitle;
    }
    public double getsalary(){
        return salary;
    }
    public void raiseSalary(double percentage){
        salary= salary+salary*percentage/100;
    }
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
      }
    }

    public static void main(String args[]){
        Employee emp1 = new Employee("shivansh", "software engineer", 8500000);

        emp1.printEmployeeDetails();
        emp1.raiseSalary(5);
        emp1.printEmployeeDetails();
    }
}
