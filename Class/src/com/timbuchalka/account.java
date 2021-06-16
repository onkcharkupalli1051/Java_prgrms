package com.timbuchalka;

public class account {
    private int accountNumber;
    private double accountBalance;
    private String accountName;
    private String accountEmail;
    private String accountPhoneNumber;

    public account(){
        this(000,0,"no name","noname@xyz.com",000);
        System.out.println("Empty Constructor");
    }
    public account(int accountNumber, double accountBalance, String accountName, String accountEmail, String accountPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public void depositFund(double fund){
        if(fund>0){
            accountBalance += fund;
        }
    }

    public void withdrawFund(double fund){
        if(fund > accountBalance){
            System.out.println("Insufficient Account Balance");
        }else{
            accountBalance -= fund;
        }
    }
}
