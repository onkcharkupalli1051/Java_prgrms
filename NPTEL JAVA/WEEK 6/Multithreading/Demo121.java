import java.io.*;

public class Demo121 {
    public static void main(String[] args) {
        double principalAmount = 0.0;
        double rateOfInterest = 0.0;
        int numberOfYears = 0;

        try{
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter Principal Amount : ");
            System.out.flush();
            tempString = in.readLine();
            principalAmount = Float.valueOf(tempString);

            System.out.println("Enter Rate Of Interest : ");
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);

            System.out.print("Enter number of Years : ");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);
        }
        catch(Exception e){
            System.out.println("Exception :"+e.getMessage());
        }

        //Input is over : Calculate Interest
        double interestTotal = principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total Interest : "+interestTotal);
    }
}
