package com.rbr;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolderName = "ONkar";
        bankAccount.setAccountBalance(0);
        bankAccount.setPhoneNumber("123465789");

        bankAccount.openAccount();
        bankAccount.checkBalance();

        bankAccount.addMoney(1000);
        bankAccount.withDrawMoney(500);

        bankAccount.checkBalance();
        bankAccount.withDrawMoney(2000);
    }
}
