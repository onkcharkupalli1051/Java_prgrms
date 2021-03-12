//4. WAP to display N Prime numbers.
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int num,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num/limit :");
        num = s.nextInt();

        System.out.println("Prime Numbers : ");
        for(i=2;i<=num;i++)
        {
            int count = 0;
            for(int j = 2;j<=i;j++)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
