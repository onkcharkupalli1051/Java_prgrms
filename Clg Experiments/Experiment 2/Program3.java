//3. WAP to display Factorial of given Number.

public class Program3 {
  public static void main(String[] args) {
    int num,i;

    num = Integer.parseInt(args[0]);

    for(i=num-1;i>0;i--)
    {
        num *= i;
    }
    
    System.out.print("Factorial = "+num);
  }  
}
