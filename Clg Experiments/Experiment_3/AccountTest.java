import java.util.Scanner;

class Account {
    private double balance;
    
    public Account(double initial_bal)
    {
        if(initial_bal>0.0)
        balance=initial_bal;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

    public void credit (double amount)
    {
        balance = balance + amount;
    }

    public double getBalance()
    {
        return balance;
    }
}

public class AccountTest {
    public static void main(String arg[])
    {
        Account a1 = new Account(500.00);
        Account a2 = new Account(-78.00);

        System.out.println("Account 1 Balance =" + a1.getBalance());
        System.out.println("Account 2 Balance = "+ a2.getBalance());

        Scanner sc = new Scanner(System.in);
        double deposit_amt;

        System.out.println("Enter deposit amount for account");
        deposit_amt = sc.nextDouble();
        a1.credit(deposit_amt);
        System.out.println("Account 1 Balance =" + a1.getBalance());
    }
}