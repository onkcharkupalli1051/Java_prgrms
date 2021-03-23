import java.util.Scanner;

public class Java_Stdin_and_Stdout2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String myString = s.next();
        int myInt = s.nextInt();
        int myInt2 = s.nextInt();
        int myInt3 = s.nextInt();
        s.close();

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
