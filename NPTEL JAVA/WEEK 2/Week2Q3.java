public class Week2Q3 {
    public static void main(String args[]){
        //Object Of main class
        Week2Q3 q = new Week2Q3();
        //Print
        q.studentMethod();
    }

    void print(Week2Q3 object){
        System.out.print("Well Done!");
    }

    void studentMethod(){
        Week2Q3 q = new Week2Q3();
        // Call the method named 'print()' in class Question
        q.print(q);
    }


}

