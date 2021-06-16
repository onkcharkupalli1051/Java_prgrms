package com.onkarcharkupalli;

import java.util.ArrayList;

public class Account {
    public String accoutName;
    public int balance;
    public ArrayList<Integer> transactions;

    public Account(String accoutName) {
        this.accoutName = accoutName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            balance += amount;
            System.out.println(amount+" deposited. Balance is now "+this.balance);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0 && amount<=this.balance){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount+" withdrawn. Balance is now "+this.balance);
        }else{
            System.out.println("Invalid Withdraw");
        }
    }

     public void calculateBalance(){
        this.balance = 0;
        for(int i: this.transactions){
            this.balance += i;
        }
         System.out.println("Calculated Balance is : "+this.balance);
     }
}
