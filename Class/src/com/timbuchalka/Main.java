package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        account kartik = new account();

        kartik.setAccountNumber(5627);
        kartik.setAccountBalance(0);
        kartik.setAccountName("Kartik Anil Charkupalli");
        kartik.setAccountEmail("kartik@gmail.com");
        kartik.setAccountPhoneNumber("7822028734");

        System.out.println("Account Number : "+kartik.getAccountNumber()
                +"\nAccount Balance : "+kartik.getAccountBalance()
                +"\nAccount Name : "+kartik.getAccountName()
                +"\nAccount Email : "+kartik.getAccountEmail()
                +"\nAccount Phone Number : "+kartik.getAccountPhoneNumber()
        );

        kartik.depositFund(2000);
        System.out.println("Deposited : "+kartik.getAccountBalance());

        kartik.withdrawFund(5000);
        System.out.println("Withdrawn 5000 : "+kartik.getAccountBalance());

        kartik.withdrawFund(1000);
        System.out.println("Withdrawn : "+kartik.getAccountBalance());

        account Onkar = new account();
        System.out.println("Account Number : "+Onkar.getAccountNumber()
                +"\nAccount Balance : "+Onkar.getAccountBalance()
                +"\nAccount Name : "+Onkar.getAccountName()
                +"\nAccount Email : "+Onkar.getAccountEmail()
                +"\nAccount Phone Number : "+Onkar.getAccountPhoneNumber()
        );


    }
}
