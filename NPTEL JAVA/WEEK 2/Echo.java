public class Echo {
    public static void main(String args[]){
        System.out.println("Hello");

        for(int i=0; i<args.length; i++){
            System.out.print(args[i] + " ");
            System.out.print("\n");
        }
        System.exit(0);
    }
}

