//6. Program to convert Temperature from celsius to fahrenheit.
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        float tc,tf;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius : ");
        tc = s.nextInt();

        tf = (tc*9)/5 + 32;
        System.out.println("Temperature in Fahrenheit : "+tf);
    }
}
