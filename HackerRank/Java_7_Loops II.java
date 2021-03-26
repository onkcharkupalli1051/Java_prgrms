import java.util.*;
import java.io.*;

public class Java_7_Loops II {
    Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int flag = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // int s = a,j=1;
            // while(n)
            // {
            //     s = s + (j)*b;
            //     if(flag != 1)
            //         System.out.print(s+" ");
            //     else{
            //         System.out.print(" "+s+" ");
            //         flag = 0;
            //     }
            //     j = j*2; 
            //     n--;
            // }
            // flag = 1;
            // System.out.println("");

            for(int j=0;j<n;j++)
            {
                a = a + (int)Math.pow(2,j)*b;
                System.out.println(a + " ");
            }
            System.out.println("");
        }
        in.close();
}
