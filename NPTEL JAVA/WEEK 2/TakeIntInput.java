import java.util.Scanner;

public class TakeIntInput {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n,m;
        System.out.println("Enter 1st no : ");
        n = s.nextInt();

        System.out.println("Enter 2nd no. : ");
        m = s.nextInt();

        System.out.println("Sum of nos are : ",(m+n));
    }
}