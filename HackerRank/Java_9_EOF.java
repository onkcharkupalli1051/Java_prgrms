import java.util.Scanner;

public class Java_9_EOF {
    Scanner s = new Scanner(System.in);
    int count = 1;
    while(s.hasNext())
    {
        count++;
        System.out.println(count+" "+s.nextLine());
    }
}
