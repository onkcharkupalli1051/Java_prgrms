import java.util.*;

public class Array1 {
    public static void main(String args[]){
        float sum=0, avg=0;

        ArrayList <Integer> l = new ArrayList<Integer>();

        System.out.print("Enter the array elements : ");
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()){
            l.add(s.nextInt());
        }

        for(int i=0; i<l.size(); i++){
            sum += l.get(i);
        }

        avg = sum/(l.size());

        System.out.println("Sum : "+sum+" Average : "+avg);
    }
}