public class demo104 {
    static int anyFunction(int x, int y){
        try{
            int a = x/y;
            return a;
        }
        catch (ArithmeticException e){
            System.out.println("Division By Zero.");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a,b,result;
        a = 0;
        b = 0;

        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            result = anyFunction(a,b);
            System.out.println("Result : "+result);
        }
        catch (Exception e){
            result = anyFunction(a,b);
            System.out.println("Result : "+result);
        }
    }
}