public class Quiz1 {
    public static void main(String args[]){
        char a = '3';
        int b = 011;
        System.out.println(a+b);

        char[] copyFrom = {'j','a','n','j','a','v','a','n','p','t','e','l'};
        char[] copyTo = new char[9];

        System.arraycopy(copyFrom,3,copyTo,0,9);
        System.out.println(new String(copyTo));

        System.out.println("Question 4");
        for(String s: args){
            System.out.println(s+args[0]);
        }

        boolean m = Integer.valueOf(1).equals(Long.valueOf(1));
        System.out.println(m);

        int i = 10;
        int n = i++%5; //1
        System.out.println("n : "+n+" i : "+i);
        int im = ++i%5; //0
        System.out.println("im : "+im+"i : "+i+"Final : "+(i+n+im));
    }
}