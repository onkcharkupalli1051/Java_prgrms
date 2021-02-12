import java.util.Scanner;

public class factorial {
    static double n;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        double facto = 1;
        System.out.println("Enter any number : ");
        n = s.nextDouble();
        if((n==0) || (n==1)){
            System.out.println("Factorial of "+n+" : "+facto);
            return;
        }
        for(double i=1; i<=n; i++){
            facto = facto *i;
        }
        System.out.println("Factorial of "+n+" : "+facto);
        return;
    }
}
