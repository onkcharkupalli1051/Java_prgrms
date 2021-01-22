import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        if(x>=y && x>=z){result = x;System.out.println(result);}
        else if(y>=x && y >=z){result = y;System.out.println(result);}
        else{result = z;System.out.println(result);}
    }
}