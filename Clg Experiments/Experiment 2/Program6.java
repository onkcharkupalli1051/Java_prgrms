//6. Program to convert Temperature from celsius to fahrenheit.

public class Program6 {
    public static void main(String[] args) {
        float tc,tf;
        tc = Float.parseFloat(args[0]);

        tf = (tc*9)/5 + 32;
        System.out.println("Temperature in Fahrenheit : "+tf);
    }
}
