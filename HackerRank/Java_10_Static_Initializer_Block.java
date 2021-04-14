import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Java_10_Static_Initializer_Block {
    //Write your code here
    static boolean flag = true;
    static int B,H;

    static{
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        s.nextLine();
        H = s.nextInt();
        s.close();

        if(B>0 && H>0)
            flag = true;
        else if(B<=0 || H<=0)
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
