//4. WAP to display N Prime numbers.

public class Program4 {
    public static void main(String[] args) {
        int num,i;
        
        num = Integer.parseInt(args[0]);

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
