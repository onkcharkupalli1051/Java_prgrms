//2. WAP to calculate Simple Interest.
public class Program2 {
    public static void main(String[] args) {
        double pA, rOI, nOY, sI;
        
        pA = Double.parseDouble(args[0]);

        rOI = Double.parseDouble(args[1]);

        nOY = Double.parseDouble(args[2]);

        sI = pA*nOY*rOI;
        System.out.println("Simple Interest : "+sI);
    }
}
