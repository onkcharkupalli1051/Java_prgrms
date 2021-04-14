import java.util.Scanner;

class Student{
    String name;
    String address;
    int rollno;
    float percentage;

    void getdata()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student Name  : ");
        name = s.nextLine();
        
        System.out.print("Enter Student Address  : ");
        address = s.nextLine();
        
        System.out.print("Enter RollNo : ");
        rollno = s.nextInt();

        System.out.println("Enter Student Percentage  : ");
        percentage = s.nextFloat();
    }

    void display()
    {
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll No : "+rollno);
        System.out.println("Student Address : "+address);
        System.out.println("Student Percentage : "+percentage);
    }
}

public class Student_Demo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getdata();
        s1.display();
        
    }
}