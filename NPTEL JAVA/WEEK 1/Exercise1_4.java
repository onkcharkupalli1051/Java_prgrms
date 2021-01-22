/*
Complete the code segment to check whether the number is an
Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is
equal to the sum of cubes of its digits
for example 153 = 1^3+5^3+3^3, 370, 371, 407, etc.
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise1_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int result = 0;
        int d,sum=0;

        while(n > 0){
            d = n%10;
            n /= 10;

            sum += Math.pow(d,3);
        }

        if(sum == temp){
            result = 1;
        }
        else{
            result = 0;
        }
        System.out.println(result);
    }
}