import java.util.regex.*;

public class del {
    public static void main(String[] args) {
        String p0 = "[Java][7-9]";
        String p1 = "v8";
        String p2 = "J9";
        String p3 = "j7";
        String p4 = "Java8";


        if(p0 == p1) {System.out.println("1");}
        if(p0 == p2) {System.out.println("2");}
        if(p0 == p3) {System.out.println("3");}
        if(p0 == p4) {System.out.println("3");}

        System.out.println(Pattern.matches(p0, p1));//true (2nd char is s)
        System.out.println(Pattern.matches(p0, p2));//false (2nd char is not s)
        System.out.println(Pattern.matches(p0, p3));//false (has more than 2 char)
        System.out.println(Pattern.matches(p0, p4));//false (has more than 2 char)
    }
}