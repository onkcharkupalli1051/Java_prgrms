public class DataRaces extends Thread{
    static int x;
    public void run(){
        for(int i=0; i<10; i++){
            x += 1;
            x -= 1;
        }
    }

    public static void main(String[] args) {
        x = 0;
        for(int i=0; i<10; i++){
            new DataRaces().start();
        System.out.println(x);
        }
    }
}
