import java.io.*;

public class DataInputStream{
    public static void main(String args[]) {
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;

        DataInputStream in = new DataInputStream(System.in);
        String tempString;

        System.out.println("Enter Principal Amount : ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);

        System.out.println("Enter Rate Of Interest : ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);

        System.out.println("Enter number of years : ");
        System.out.flush();
        tempString = in.readline();
        numberOfYears = Integer.parseInt(tempString);

        float InterestTotal = principalAmount * rateOfInterest * numberOfYears;
        System.out.println("Total Interest : " + InterestTotal);


    }
}