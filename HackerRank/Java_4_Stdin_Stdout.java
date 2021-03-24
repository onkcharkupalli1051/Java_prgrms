import java.util.Scanner;

public class Java_4_Stdin_Stdout {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        double d = s.nextDouble();
        String str = s.nextLine();
        str = s.nextLine();

        System.out.println("String:"+str);
        System.out.println("Double:"+d);
        System.out.println("Int:"+i);


    }
}