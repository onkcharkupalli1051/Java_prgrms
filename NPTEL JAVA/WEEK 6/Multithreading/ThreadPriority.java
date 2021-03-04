class A extends Thread{
    public void run(){
        for(int i=1; i<=4; i++){
            System.out.println("From Thread A with i : "+i);
        }
        System.out.println("Exiting from Thread A");
    }
}

class B extends Thread{
    public void run(){
        for(int j=1; j<=4; j++){
            System.out.println("From Thread B with j : "+j);
        }
        System.out.println("Exiting from THread B");
    }
}

class C extends Thread{
    public void run(){
        for(int k=1;k<=4;k++){
            System.out.println("From Thread C with k :"+k);
        }    
        System.out.println("Exiting from Thread C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Started Thread A");
        threadA.start();
        System.out.println("Started Thread B");
        threadB.start();
        System.out.println("Started Thread C");
        threadC.start();
        System.out.println("End OF main thread");
    }
}
