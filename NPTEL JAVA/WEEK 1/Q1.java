import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter, area;

        if(radius <= 0){
            System.out.println(" please enter non zero positive number");
        }
        else {
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;

            System.out.println(perimeter + "\n" + area);
        }
    }
}

