package com.challenge.mobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    Contacts mpcontacts = new Contacts();
    private static Scanner scanner = new Scanner(System.in);

    public void newContact(String name){
        mpcontacts.add(name);
    }

    //
    private static ArrayList<String> contacts = new ArrayList<String>();

    private void newContact(String name){
        contacts.add(String);
    }

    private void modifyContact(String name, String newName){
        int position = contacts.indexOf(name);
        if(position != -1){
            contacts.set(position,newName);
            System.out.println(newName+" contact set.");
        }
        else{
            System.out.println("Contact Not Found");
        }
    }
}
