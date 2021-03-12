import java.util.*;

class Practical1_2{
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = s.nextInt();

        System.out.print("Enter second number : ");
        b = s.nextInt();

        sum = a + b;
        System.out.println("Sum : "+sum);
    }
}
