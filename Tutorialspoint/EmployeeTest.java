import java.io.*;
public class EmployeeTest {

    public static void main(String args[]){

        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(26);
        empOne.empDesignation("Engineer");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(30);
        empTwo.empDesignation("Doctor");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}