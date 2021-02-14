import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        num = s.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
