//5. WAP to display Fibonacci series upto n.
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int num,a = 0,b = 1,c;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter num/limit :");
        num = s.nextInt();

        System.out.print("Fibonacci Series : ");
        System.out.print(a+" "+b+" ");
        for(int i=0;i<num;i++)
        {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        
    }
}
