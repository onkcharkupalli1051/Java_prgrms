import java.util.Scanner;

class Employee{
    String name;
    String address;
    int id;
    float salary;

    void getdata()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee Name  : ");
        name = s.nextLine();
        
        System.out.print("Enter Employee Address  : ");
        address = s.nextLine();
        
        System.out.print("Enter ID : ");
        id = s.nextInt();

        System.out.print("Enter Salary  : ");
        salary = s.nextFloat();
    }

    void display()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Address : "+address);
        System.out.println("Employee Salary : "+salary);
    }
}

public class Employee_Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getdata();
        e1.display();
    }
}
