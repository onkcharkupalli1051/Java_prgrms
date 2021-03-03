public class Demo106 {
    public static void main(String[] args) {

        int i = args.length;
        String myString[] = new String[i];
        myString[0] = args[0];
        if(args[0].equals("Java")){
            System.out.println("First Word is Java");
        }
        System.out.println("Number of Arguments : "+i);
        int x = 12/i;
        int y[] = {555,999};
        y[i] = x;
    }
}