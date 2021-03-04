class Account{
    private int balance;
    public int accountNo;
    
    void displayBalance(){
        System.out.println("Account No : "+accountNo+"Balance : "+balance);
    }

    synchronized void deposite(int amount){
        //MEthod to deposit to amount
        balance = balance + amount;
        System.out.println(amount + "is deposited");
        displayBalance();
    }

    synchronized void withdraw(int amount){
        //method to withdraw an amount
        balance = balance - amount;
        System.out.println(amount + "is withdrawn");
        displayBalance();
    }
}

class TransactionDeposite implements Runnable{
    Account accountx;
    TransactionDeposite(Account x,int amount){
        //Constructor to initialize this thread
        accountx = x;
        this.amount = amount;
        new Thread (this).start();
    }
    public void run(){
        accountx.deposite(amount);
    }
}

class TransactionWithdraw implements Runnable{
    Account accountY;
    int amount;
    TransactionWithdraw(Account y, int amount){
        accountY = y;
        this.amount = amount;
        new Thread (this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}

public class Transaction {
    public static void main(String[] args) {
        Account ABC = new Account();

        ABC.balance = 1000;

        TransactionDeposite t1;

        TransactionWithdraw t2;

        t1 = new TransactionDeposite(ABC, 500);

        t2 = new TransactionWithdraw(ABC, 900);
    }    
}
