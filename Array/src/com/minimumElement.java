package com;

import java.util.Scanner;

public class minimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        System.out.println("Enter number of elements : ");
        count = scanner.nextInt();
        int[] myArray = readintegers(count);
        System.out.println("Minimum = "+findMin(myArray));
    }

    private static int[] readintegers(int count){
        int[] myArray = new int[count];

        for(int i=0;i<count;i++){
            System.out.println("Enter "+(i+1)+" element : ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
