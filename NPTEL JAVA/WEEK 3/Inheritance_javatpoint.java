public class Inheritance_javatpoint {
    class Employee{
        static int salary = 15;
    }

    class Programmer extends Employee{
        static int bonus = 5;
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary : "+salary+" Bonus : "+bonus);
    }
}
