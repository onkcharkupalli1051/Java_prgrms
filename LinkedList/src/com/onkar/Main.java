package com.onkar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        addInOrder(places,"Mountains");
        addInOrder(places,"Desert");
        addInOrder(places,"Beaches");
        addInOrder(places,"Grasslands");
        printList(places);
        visit(places);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting : "+ i.next());
        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity+"is already included as a destination");
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itemarary");
            return;
        }else{
            System.out.println("Now Visiting "+listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Holiday Over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting "+listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("now Visiting : "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions : ");
        System.out.println("0 : Quit\n" +
                "1 : Next City\n+" +
                "2 : Previous City\n" +
                "3 : Print Menu options");
    }
}
