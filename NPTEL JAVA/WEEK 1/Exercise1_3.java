import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int count = 0;
        int i = 0;

        while(count < n) {
            if(i%2==0){
                count += 1;
                if(i%3 == 0) {
                    sum += i;
                    i += 1;
                }
                else{
                    i+=1;
                }
            }
            else{
                i+=1;
            }
        }
        System.out.println(sum);
        }
    }
