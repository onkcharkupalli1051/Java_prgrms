package com.onkar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("7385417160");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action : ");
            int action = scanner.nextInt();

            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter New Contact Name : ");
        String name =scanner.nextLine();
        System.out.println("Enter phone Number : ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added: name = "+name+", phone = "+phone);
        }else{
            System.out.println("Cannot add, "+ name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Enter new contact name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact phoneNumber : ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Succesfully Updated Contact");
        }else{
            System.out.println("Error updating record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Succesfully Removed");
        }
        else {
            System.out.println("Error!");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name : " + existingContactRecord.getName() + " phone number is "+ existingContactRecord.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.println("Operations");
        System.out.println("0 : Shutdown\n" +
                "1 : Print Contacts\n" +
                "2 : Add new Contact\n" +
                "3 : Update Existing Contact\n" +
                "4 : Remove Existing Contact\n" +
                "5 : Query Contact\n" +
                "6 : Print Actions\n" +
                "Choose your action : ");
    }
}
