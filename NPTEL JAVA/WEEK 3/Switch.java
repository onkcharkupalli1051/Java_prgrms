import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        switch(choice){
            case 1:
            {
                System.out.println("Case 1");
                break;
            }
            case 2:
            {
                System.out.println("Case 2");
                break;
            }
        }
        return;
    }
    
}
