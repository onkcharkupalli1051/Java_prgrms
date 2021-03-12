//1. WAP in java for Addition, Subtraction, multiplication and division of numbers.

import java.util.*;

class Program1{
    public static void main(String[] args) {
        int n1,n2,result;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        n1 = s.nextInt();

        System.out.print("\nEnter Second Number : ");
        n2 = s.nextInt();

        result = n1 + n2;
        System.out.println("Addition : "+result);

        result = n1-n2;
        System.out.println("Subtraction : "+result);

        result = n1*n2;
        System.out.println("Multiplication : "+result);

        result = n1/n2;
        System.out.println("Division : "+result);
    }
}