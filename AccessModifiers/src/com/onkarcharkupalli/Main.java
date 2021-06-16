package com.onkarcharkupalli;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Onkar");
        account1.deposit(100);
        account1.withdraw(100);
        account1.withdraw(1000);

        account1.deposit(1000);
        account1.withdraw(500);
        account1.calculateBalance();
    }
}
