//3. WAP to display Factorial of given Number.

import java.util.Scanner;
public class Program3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num,i;

    System.out.print("Enter number : ");
    num = s.nextInt();

    for(i=num-1;i>0;i--)
    {
        num *= i;
    }
    
    System.out.print("Factorial = "+num);
  }  
}
