class ThreadId extends Thread{
    public void run(){
        try{
            //Displaying the thread that is running
            System.out.println("Thread : "+Thread.currentThread().getId()+" is running.");
        }
        catch(Exception e){
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class Demo113 {
    public static void main(String[] args) {
        int n = 0;  //Number Of Threads
        for(int i=0;i<8;i++){
            ThreadId object = new ThreadId();
            object.start();
        }
    }    
}
