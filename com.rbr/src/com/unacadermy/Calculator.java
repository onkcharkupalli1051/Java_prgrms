package com.unacadermy;

public class Calculator {
    public int calculator(int a, int b, char op){
        int res = 0;
        switch(op){
            case '+':
                res = a+b;
                break;

                case '-':
                    res = a-b;
                    break;
            case '*':
                res = a*b;
                break;

                case '/':
                    if(b != 0) {
                        res = a / b;
                    }
                    break;
            default:
                System.out.println("Invalid Operator.");
        }
        return res;
    }
}
