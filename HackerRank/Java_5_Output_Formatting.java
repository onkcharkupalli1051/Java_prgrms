public class Java_5_Output_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n",s1,x);
            // % : formatter
            //- : left indentation of string
            //15s : string minimum field width 15
            // 0 ": padding
            //3d : integer minimum field width 3
        }
        System.out.println("================================");
    }
}