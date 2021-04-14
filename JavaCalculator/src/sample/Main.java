package sample;

public class Main{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10,5,'+');
        System.out.println("Add : " +res);

        res = calculator.calculate(10,5,'-');
        System.out.println("Subtraction : " +res);

        res = calculator.calculate(10,5,'*');
        System.out.println("Multiplication : " +res);

        res = calculator.calculate(10,5,'/');
        System.out.println("Division : " +res);

        res = calculator.calculate(10,5,'R');
        System.out.println("Add : " +res);
    }
}
