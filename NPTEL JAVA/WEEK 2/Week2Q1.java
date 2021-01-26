public class School {
    public void print(){
        System.out.println("Hi! I class SCHOOL");
    }
}

class Student{
    public void print(){
        System.out.println("Hi! I am class STUDENT");
    }
}

public class Week2Q1{
    public static void main(String args[]){
        School S1 = new School();
        Student A = new Student();

        A.print();
        A.print();
    }
}