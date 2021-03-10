import java.io.*;

class InterestCalculator{
    public static void main(String[] args) {
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;

        DataInputStream in = new
        DataInputStream(System.in);
        String tempString;
        System.out.print("Enter Principal Amount : ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        
        System.out.print("Enter Rate OF Interest : ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        
        System.out.println("Enter Number OF Years : ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);

        int interstTotal = principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total Interest : "+interstTotal);
    }
}