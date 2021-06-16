package com;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter choice : ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    System.out.println("Enter item name : ");
                    String item = scanner.next();
                    groceryList.addGroceryItem(item);
                    break;
                case 3:
                    System.out.println("Enter item position : ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new item name : ");
                    item = scanner.nextLine();
                    groceryList.modifyGroceryList(position,item);
                    break;
                case 4:
                    System.out.println("Enter item position : ");
                    position = scanner.nextInt();
                    groceryList.removeGroceryItem(position);
                    break;
                case 5:
                    System.out.println("Enter search item name : ");
                    item = scanner.nextLine();
                    groceryList.findItem(item);
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("0 : Print Instructions");
        System.out.println("1 : Print Items");
        System.out.println("2 : Add Items");
        System.out.println("3 : Modify Items");
        System.out.println("4 : Remove Items");
        System.out.println("5 : Search Item");
        System.out.println("6 : Quit");
    }
}
