package sample;

public class Calculator {
        public int calculate(int a, int b, char op) {
            int res = 0;
            switch (op) {
                case '+':
                    res = add(a, b);
                    break;

                case '-':
                    res = sub(a,b);
                    break;

                case '*':
                    res = mul(a,b);
                    break;

                case '/':
                    if (b != 0) {
                        res = div(a,b);
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
            }
            return res;
        }
        private int add(int a,int b){return a+b;}
        private int sub(int a,int b){return a-b;}
        private int mul(int a,int b){return a*b;}
        private int div(int a,int b){return a/b;}
    }
