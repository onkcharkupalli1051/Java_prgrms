import java.util.Scanner;

public class factorial_recursion {
    static double n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n : ");
    UserInput input = new UserInput();
    n = s.nextDouble();

    static double factorial(double n)
    {
        if(n==0){return 1;}
        else{return(n*factorial(n-1));}
    }
    public static void main(String args[])
    {
        //Recursive x = new factorial_recursion();
        System.out.println("Factorial of "+n+" : "+factorial(n));
    }
}
