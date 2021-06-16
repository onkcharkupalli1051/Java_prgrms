package com;
import java.util.Scanner;

public class arrayAverage {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getNumber(5);

        for(int i=0;i<myArray.length; i++){
            System.out.println("Element "+i+" : "+myArray[i]);
        }

        System.out.println("Average : "+average(myArray));
    }

    public static int[] getNumber(int n){
        int[] values = new int[n];
        System.out.println("Enter "+n+" values : ");

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double average(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }
}
