//2. WAP to calculate Simple Interest.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        double pA, rOI, nOY, sI;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        pA = s.nextInt();

        System.out.print("Enter Rate Of Interest : ");
        rOI = s.nextInt();

        System.out.print("Enter Number Of Years : ");
        nOY = s.nextInt();

        sI = pA*nOY*rOI;
        System.out.println("Simple Interest : "+sI);
    }
}
