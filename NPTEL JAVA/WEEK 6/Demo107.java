public class Demo107 {
    public static void main(String[] args) {
        try{
            int i = args.length;
            String myString[] = new String[i];

            //if i=0 then myString null pointer error
            if(myString[0].equals("Java")){
                System.out.println("First word is Java!");
            }
            System.out.println("Number of arguments : "+i);
            int x = 12/i;
            int y[] = {555,999};
            y[i] = x;
        }
        catch(ArithmeticException e){
            System.out.println("Div by 0 : "+e);
        }
        catch(NullPointerException e){
            System.out.println("A null pointer exception : "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index OUB : "+e);
        }
    }
}