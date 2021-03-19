//1. WAP in java for Addition, Subtraction, multiplication and division of numbers.

import java.util.*;

class Program1{
    public static void main(String[] args) {
        double n1,n2,result;

        n1 = Double.parseDouble(args[0]);
        n2 = Double.parseDouble(args[1]);

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