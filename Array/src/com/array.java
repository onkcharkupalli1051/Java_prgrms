package com;
import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        double[] myArray = new double[10];

        for(int i=0; i<myArray.length ;i++){
            myArray[i] = i*10;
        }

        printArray(myArray);
    }

    public static void printArray(double arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
