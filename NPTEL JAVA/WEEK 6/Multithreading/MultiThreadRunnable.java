class ThreadX implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread X with i : "+(-1*i));
        }
        System.out.println("Exiting Thread X...");
    }
}

class ThreadY implements Runnable{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("Thread Y with j :"+(2*j));
        }
        System.out.println("Exiting Thread Y...");
    }
}

class ThreadZ implements Runnable{
    public void run(){
        for(int k=1;k<=5;k++)
        {
            System.out.println("Thread Z with k : "+(2*k-1));
        }
        System.out.println("Exiting from Thread Z...");
    }
}

public class MultiThreadRunnable {
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        ThreadY t1 = new ThreadY(x);
        ThreadY y = new ThreadY();
        ThreadY t2 = new ThreadY(y);
        Thread t3 = new Thread(new ThreadZ);

        t1.start();
        t2.start();
        t3.start();
    }
}
