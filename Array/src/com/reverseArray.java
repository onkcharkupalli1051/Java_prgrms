package com;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5};
        System.out.println("myArray = "+Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("reversed myArray = "+Arrays.toString(myArray));

        reverse2(myArray);
        System.out.println("reversed myArray = "+Arrays.toString(myArray));
    }

    private static void reverse(int[] array){
        int low = 0;
        int high = array.length-1;

        while(low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

    private static void reverse2(int[] array){
        int high = array.length-1;
        int mid = array.length/2;

        for(int i=0;i<mid;i++){
            int temp = array[i];
            array[i] = array[high-i];
            array[high-i] = temp;
        }
    }
}
