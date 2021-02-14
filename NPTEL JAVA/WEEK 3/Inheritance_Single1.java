//Single Inheritance : 
public class Inheritance_Single1 {
    class Person{
        String name;
        Date dob;
        int mobile;

        void ReadData(String n, Date d, int m){
            name = n;
            dob = d;
            mobile = m;
        }

        void PrintData(){
            System.out.println("Name : "+name+dob.printDate()+" Mobile NO. : "+mobile);
        }
    }

    class Student extends Person{
        String institution;
        int qualif[] = new int[20];
        int rollNo;
        int marks[] = new int[20];

        void printBioData(){
            printData();
            System.out.println("Institution : "+institution+" Roll : "+rollNo);
            for(int i=0; i<qualif.length;i++){
                System.out.println("Marks "+i+" : "+ qualif[i]);
            }

            for(int j=0;j<marks;j++){
                System.out.println("Result "+m+" : "+marks[m]);
            }
        }
    }

    class Employee extends Person{
        int empNo;
        int salaryHistory = new int[20];
        string organization;
        string designation;
        Date doj;
        void printSalary(){
            for(int k=0; k<salaryHistory.length;k++){
                System.out.println("Salary "+s+" : "+salaryHistory[s]);
            }
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.ReadData("Onkar", 22222222, 4654546450);

        Student s = new Student[100];

        Employee e = new Employee[50];
        
    }
}

