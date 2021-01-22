import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double mark_avg;
        int result,i,s,sum=0;

        s = input.nextInt();

        int[] arr = new int[s];

        for(i=0; i< arr.length; i++){
            arr[i] = input.nextInt();
        }

        result = arr[0];
        for(i=1; i< arr.length; i++){
            if(result < arr[i]){
                result = arr[i];
            }
        }
        System.out.println(result);

        for(i=0; i<arr.length; i++){
            sum += arr[i];
        }
        mark_avg = sum/ arr.length;
        System.out.println(mark_avg);
    }
}