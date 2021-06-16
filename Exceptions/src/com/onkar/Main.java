package com.onkar;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 90;
//        int y = 0;
//
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x,y));
//
//        int z = getIntLBYL();
//        System.out.println("z : "+z);
//
//        Scanner s = new Scanner(System.in);
//        int check = s.nextInt();
//        int n = getInt();
//        System.out.println("n : "+n);
        try{
            int result = divide();
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException|NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    //proper
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Enter valid Integer. : ");
            }
        }
    }

    private static int divide(){
        int x,y;
        try{
            x = getInt();
            y = getInt();
            System.out.println("x : "+x+" y : "+y);
            return x/y;
        }catch (NoSuchElementException e){
            throw new ArithmeticException("No suitable input");
        }catch(ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by zero");
        }
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        boolean isTrue = true;

        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                return 0;
            }
        }
        return Integer.parseInt(input);
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integer : ");
        try{
            return s.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }
    private static int divideLBYL(int x, int y){
        if(y != 0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;

        }
    }
}
