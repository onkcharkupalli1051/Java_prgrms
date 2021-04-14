package com.rbr;

public class BankAccount{
    public String accountHolderName;
    private double accountBalance;
    private String accountEmailId;
    private String phoneNumber;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountEmailId() {
        return accountEmailId;
    }

    public void setAccountEmailId(String accountEmailId) {
        this.accountEmailId = accountEmailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void openAccount(){
        System.out.println("Account Opened for "+accountHolderName);
    }

    public void checkBalance(){
        System.out.println("Account Balance is "+getAccountBalance());
    }

    public void addMoney(int amount){
        if(amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " rupees added to account,\n" +
                    "updated balance is " + getAccountBalance());
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void withDrawMoney(int amount){
        if(accountBalance > amount){
            accountBalance -= amount;
            System.out.println(amount + " withdrawn from account,\n" +
                    "updated balance is " + getAccountBalance());
            System.out.println("Insufficient Balance.");
        }
        else{
            System.out.println("Insufficient Balance.");
        }
    }
}