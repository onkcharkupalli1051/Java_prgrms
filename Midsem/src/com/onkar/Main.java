package com.onkar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array : ");
        n = s.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element "+i+" : ");
            arr[i] = s.nextInt();
        }

        System.out.println("Array Elements are : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        int mid = n/2;
        for(int i=0; i<=mid; i++){
            for(int j=i+1; j<=mid; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=mid+1; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array Elements are : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
