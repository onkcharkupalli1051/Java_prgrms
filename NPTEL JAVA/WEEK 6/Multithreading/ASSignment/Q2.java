class ThreadRun implements Runnable {
    public void run(){ 
        System.out.print("Thread using Runnable interface."); 
    } 
}

// Create main class Question62 with main() method and appropriate statements in it
public class Question62 extends ThreadRun{
    public static void main(String args[]){
    Question62 q = new Question62();
    Thread t = new Thread(q);
    t.start();
    }
}
  
  