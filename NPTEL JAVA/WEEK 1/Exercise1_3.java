import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int array[n];

        for(int i=0; i<n; i++){
            if(i%2==0 && i%3==0) {
                sum += i;
            }

        }

        System.out.println(sum);
        }
    }
}