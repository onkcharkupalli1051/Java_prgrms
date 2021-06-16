package com;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String newItem){
        groceryList.add(newItem);
    }

    public void printGroceryItem(){
        System.out.println("You have "+groceryList.size()+" items.");
        for (int i=0;i<groceryList.size(); i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
    }

    public String findItem(String searchItem){
        //boolean result = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }


}
